package net.luvina.registration.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import net.luvina.registration.dto.CourseReqSearchDto;
import net.luvina.registration.dto.CourseResDto;
import net.luvina.registration.entity.Course;
import net.luvina.registration.mapper.CourseMapper;
import net.luvina.registration.repository.CourseRepository;
import net.luvina.registration.strategy.SortCourseStrategy;

@Service
@RequiredArgsConstructor
public class CourseService {

  private final CourseRepository courseRepository;

  private final CourseMapper courseMapper;

  private SortCourseStrategy sortCourseStrategy;

  public void setSortCourseStrategy(SortCourseStrategy sortCourseStrategy) {
    this.sortCourseStrategy = sortCourseStrategy;
  }

  @Cacheable(value = "courses", keyGenerator = "getCourseKeyGenerator")
  @Transactional(readOnly = true)
  public List<CourseResDto> getCourses(CourseReqSearchDto courseReqSearchDto) {
    List<Course> courses = new ArrayList<>();
    String keyword = courseReqSearchDto.getKeyword();
    String sortBy = courseReqSearchDto.getSortBy();
    if (sortBy == null) {
      if (keyword == null) {
        courses = courseRepository.findAll();
      } else if (keyword != null) {
        courses = courseRepository.findAllByNameLike("%" + keyword + "%");
      }
    } else if (sortBy != null) {
      Sort sort = sortCourseStrategy.getSort();
      if (keyword == null) {
        courses = courseRepository.findAll(sort);
      } else if (keyword != null) {
        courses = courseRepository.findAllByNameLike(sort, "%" + keyword + "%");
      }
    }
    return courses.stream().map(course -> courseMapper.convertToCourseResDto(course)).collect(Collectors.toList());
  }

}
