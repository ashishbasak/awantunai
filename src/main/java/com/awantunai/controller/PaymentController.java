package com.awantunai.controller;

//collect payment,  refund

import com.awantunai.dto.request.PaymentRequestDto;
import com.awantunai.dto.request.RefundRequestDto;
import com.awantunai.dto.response.ResponseDTO;
import com.awantunai.service.PaymentService;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/${base.version}/payment")
@CrossOrigin
public class PaymentController {
    //after payment call order service

    @Autowired
    private PaymentService paymentService;


    @PostMapping("/pay")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong")})
    public ResponseDTO payment(@RequestBody PaymentRequestDto paymentRequestDto, HttpServletRequest request) {
        return paymentService.pay(paymentRequestDto);
    }

    @PostMapping("/refund")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong")})
    public ResponseDTO refund(@RequestBody RefundRequestDto refundRequestDto, HttpServletRequest request) {
        return paymentService.refund(refundRequestDto);
    }
}