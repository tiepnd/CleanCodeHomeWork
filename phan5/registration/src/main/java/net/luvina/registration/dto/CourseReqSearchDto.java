package net.luvina.registration.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class CourseReqSearchDto {

  @ApiModelProperty(value = "Keyword", example = "Spring")
  private String keyword;

  @ApiModelProperty(value = "sortBy", example = "name")
  private String sortBy;

}
