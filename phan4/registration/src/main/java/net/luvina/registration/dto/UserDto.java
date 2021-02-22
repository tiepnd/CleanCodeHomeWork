package net.luvina.registration.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserDto {

  @ApiModelProperty(value = "Name", example = "Canh")
  private String name;

  @ApiModelProperty(value = "Email", example = "canh@mail.com")
  private String email;

  @ApiModelProperty(value = "Password", example = "123456")
  private String password;
  
  private StudentDto student;

  private TeacherDto teacher;

  @ApiModelProperty(value = "Mode user", example = "STUDENT")
  private String mode;
}
