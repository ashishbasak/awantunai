package com.awantunai.service;

import com.awantunai.dto.request.PaymentRequestDto;
import com.awantunai.dto.request.RefundRequestDto;
import com.awantunai.dto.response.ResponseDTO;

public interface PaymentService {
    ResponseDTO pay(PaymentRequestDto paymentRequestDto);

    ResponseDTO refund(RefundRequestDto refundRequestDto);
}
