package net.luvina.registration.factory;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import net.luvina.registration.dto.UserDto;
import net.luvina.registration.entity.User;
import net.luvina.registration.enums.UserType;
import net.luvina.registration.mapper.UserMapper;

@Component
@RequiredArgsConstructor
public class UserFactory {

  private final UserMapper userMapper;

  public User createUser(UserDto userDto) {
    if (UserType.STUDENT.toString().equals(userDto.getMode())) {
      return userMapper.convertToStudent(userDto);
    } else if (UserType.TEACHER.toString().equals(userDto.getMode())) {
      return userMapper.convertToTeacher(userDto);
    } else {
      throw new UnsupportedOperationException("Unsupported register mode");
    }
  }

}
