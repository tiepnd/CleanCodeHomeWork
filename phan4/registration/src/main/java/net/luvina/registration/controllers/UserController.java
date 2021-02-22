package net.luvina.registration.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import net.luvina.registration.dto.UserDto;
import net.luvina.registration.dto.UserResDto;
import net.luvina.registration.service.UserService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {

  private final UserService userService;

  @PostMapping
  @ApiOperation("Create User")
  @ApiResponses({ @ApiResponse(code = 200, message = "Create user successfully") })
  public ResponseEntity<UserResDto> createUser(@Validated @RequestBody UserDto userDto) {
    UserResDto userResDto = userService.createUser(userDto);
    return new ResponseEntity<>(userResDto, HttpStatus.OK);
  }
}
