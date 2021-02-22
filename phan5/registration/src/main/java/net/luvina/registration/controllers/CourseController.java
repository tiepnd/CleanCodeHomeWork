package net.luvina.registration.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import net.luvina.registration.dto.CourseReqSearchDto;
import net.luvina.registration.dto.CourseResDto;
import net.luvina.registration.enums.CourseSortType;
import net.luvina.registration.service.CourseService;
import net.luvina.registration.strategy.SortCourseByNameStrategy;
import net.luvina.registration.strategy.SortCourseByOpenedStrategy;

@RestController
@RequestMapping("/api/v1/courses")
@RequiredArgsConstructor
public class CourseController {

  private final CourseService courseService;

  @GetMapping
  @ApiOperation("Get courses")
  @ApiResponses({ @ApiResponse(code = 200, message = "Get courses successfully") })
  public ResponseEntity<List<CourseResDto>> getCourses(@RequestParam(required = false) String keyword, String sortBy) {
    CourseReqSearchDto courseReqSearchDto = new CourseReqSearchDto();
    if (sortBy != null) {
      if (CourseSortType.name.toString().equals(sortBy)) {
        courseService.setSortCourseStrategy(new SortCourseByNameStrategy());
      } else if (CourseSortType.opened.toString().equals(sortBy)) {
        courseService.setSortCourseStrategy(new SortCourseByOpenedStrategy());
      }
    }
    courseReqSearchDto.setKeyword(keyword);
    courseReqSearchDto.setSortBy(sortBy);
    List<CourseResDto> courses = courseService.getCourses(courseReqSearchDto);
    return new ResponseEntity<>(courses, HttpStatus.OK);
  }

}
