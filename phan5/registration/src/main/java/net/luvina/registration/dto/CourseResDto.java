package net.luvina.registration.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class CourseResDto {
  
  @ApiModelProperty(value = "Course id", example = "1")
  private Integer id;

  @ApiModelProperty(value = "Course name", example = "Spring Boot")
  private String name;

  @ApiModelProperty(value = "Location", example = "Ha Noi")
  private String location;

  @ApiModelProperty(value = "Teacher", example = "Alie")
  private String teacherName;

}
