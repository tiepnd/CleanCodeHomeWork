package net.luvina.registration.mapper;

import org.springframework.stereotype.Component;

import net.luvina.registration.dto.CourseResDto;
import net.luvina.registration.entity.Course;

@Component
public class CourseMapper {
  
  public CourseResDto convertToCourseResDto(Course course) {
    CourseResDto courseResDto = new CourseResDto();
    courseResDto.setId(course.getId());
    courseResDto.setName(course.getName());
    courseResDto.setLocation(course.getLocation());
    courseResDto.setTeacherName(course.getTeacher().getName());
    return courseResDto;
  }

}
