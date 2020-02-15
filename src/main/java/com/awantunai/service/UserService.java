package com.awantunai.service;

import com.awantunai.dto.request.ChangeUserDetailsRequestDto;
import com.awantunai.dto.request.ForgotPasswordRequestDto;
import com.awantunai.dto.request.LoginRequestDto;
import com.awantunai.dto.request.SetupUserRequestDto;
import com.awantunai.dto.response.ResponseDTO;

public interface UserService {
    ResponseDTO createUser(SetupUserRequestDto restaurantDetailsRequest);

    ResponseDTO loginUser(LoginRequestDto loginRequestDto);

    ResponseDTO changeDetails(ChangeUserDetailsRequestDto changeUserDetailsRequestDto);

    ResponseDTO forgotPassword(ForgotPasswordRequestDto forgotPasswordRequestDto);
}
