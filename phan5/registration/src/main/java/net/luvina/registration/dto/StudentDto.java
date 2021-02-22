package net.luvina.registration.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class StudentDto {
  
  @ApiModelProperty(value = "Year", example = "3")
  private Integer year;

}
