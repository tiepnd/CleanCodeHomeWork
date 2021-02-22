package net.luvina.registration.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class TeacherDto {

  @ApiModelProperty(value = "Phone", example = "0123456789")
  private String phone;

  @ApiModelProperty(value = "Experiences", example = "10")
  private Integer experiences;

}
