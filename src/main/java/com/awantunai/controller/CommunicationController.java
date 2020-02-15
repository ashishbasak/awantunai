package com.awantunai.controller;

import com.awantunai.dto.request.CommunicationRequest;
import com.awantunai.dto.response.ResponseDTO;
import com.awantunai.service.CommunicationService;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/${base.version}/comm")
@CrossOrigin
public class CommunicationController {

    @Autowired
    private CommunicationService commumicationService;

    @PostMapping("/sendEmail")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong")})
    public ResponseDTO sendEmail(@RequestBody CommunicationRequest commRequest, HttpServletRequest request) {
        return commumicationService.sendEmail(commRequest);
    }

    @PostMapping("/sendSms")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong")})
    public ResponseDTO sendSms(@RequestBody CommunicationRequest commRequest, HttpServletRequest request) {
        return commumicationService.sendSms(commRequest);
    }

    @PostMapping("/sendEmailSms")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong")})
    public ResponseDTO sendBoth(@RequestBody CommunicationRequest commRequest, HttpServletRequest request) {
        return commumicationService.sendBoth(commRequest);
    }
}
