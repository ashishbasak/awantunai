package com.awantunai.controller;

import com.awantunai.dto.request.ChangeUserDetailsRequestDto;
import com.awantunai.dto.request.ForgotPasswordRequestDto;
import com.awantunai.dto.request.LoginRequestDto;
import com.awantunai.dto.request.SetupUserRequestDto;
import com.awantunai.dto.response.ResponseDTO;
import com.awantunai.service.UserService;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

//UserDetails signup, login, forgot password, change details
@RestController
@RequestMapping("/${base.version}/user")
@CrossOrigin
public class UserController {

    private UserService userService;

    @PostMapping("/signUp")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong")})
    public ResponseDTO createUser(@RequestBody SetupUserRequestDto restaurantDetailsRequest, HttpServletRequest request) {
        return userService.createUser(restaurantDetailsRequest);
    }

    @PostMapping("/login")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong")})
    public ResponseDTO logim(@RequestBody LoginRequestDto loginRequestDto, HttpServletRequest request) {
        return userService.loginUser(loginRequestDto);
    }

    @PostMapping("/changeDetails")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong")})
    public ResponseDTO changeUserDetails(@RequestBody ChangeUserDetailsRequestDto changeUserDetailsRequestDto, HttpServletRequest request) {
        return userService.changeDetails(changeUserDetailsRequestDto);
    }

    @PostMapping("/forgotPassword")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong")})
    public ResponseDTO forgotPassword(@RequestBody ForgotPasswordRequestDto forgotPasswordRequestDto, HttpServletRequest request) {
        return userService.forgotPassword(forgotPasswordRequestDto);
    }

}
