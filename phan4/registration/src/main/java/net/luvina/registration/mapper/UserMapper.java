package net.luvina.registration.mapper;

import org.springframework.stereotype.Component;

import net.luvina.registration.dto.UserDto;
import net.luvina.registration.dto.UserResDto;
import net.luvina.registration.entity.Student;
import net.luvina.registration.entity.Teacher;
import net.luvina.registration.entity.User;

@Component
public class UserMapper {
  
  public User convertToTeacher(UserDto userDto) {
    Teacher teacher = new Teacher();
    teacher.setName(userDto.getName());
    teacher.setEmail(userDto.getEmail());
    teacher.setPassword(userDto.getPassword());
    teacher.setPhone(userDto.getTeacher().getPhone());
    teacher.setExperiences(userDto.getTeacher().getExperiences());
    return teacher;
  }

  public User convertToStudent(UserDto userDto) {
    Student student = new Student();
    student.setName(userDto.getName());
    student.setEmail(userDto.getEmail());
    student.setPassword(userDto.getPassword());
    student.setYear(userDto.getStudent().getYear());
    return student;
  }

  public UserResDto convertToUserResDto(User user) {
    UserResDto userResDto = new UserResDto();
    userResDto.setName(user.getName());
    userResDto.setEmail(user.getEmail());
    return userResDto;
  }

}
