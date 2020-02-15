package com.awantunai.service.serviceImpl;

import com.awantunai.dto.request.ChangeUserDetailsRequestDto;
import com.awantunai.dto.request.ForgotPasswordRequestDto;
import com.awantunai.dto.request.LoginRequestDto;
import com.awantunai.dto.request.SetupUserRequestDto;
import com.awantunai.dto.response.ResponseDTO;
import com.awantunai.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public ResponseDTO createUser(SetupUserRequestDto restaurantDetailsRequest) {
        return null;
    }

    @Override
    public ResponseDTO loginUser(LoginRequestDto loginRequestDto) {
        return null;
    }

    @Override
    public ResponseDTO changeDetails(ChangeUserDetailsRequestDto changeUserDetailsRequestDto) {
        return null;
    }

    @Override
    public ResponseDTO forgotPassword(ForgotPasswordRequestDto forgotPasswordRequestDto) {
        return null;
    }
}
