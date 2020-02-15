package com.awantunai.service;

import com.awantunai.dto.request.BookTableRequestDto;
import com.awantunai.dto.request.OrderHistoryRequestDto;
import com.awantunai.dto.request.OrderRequestDto;
import com.awantunai.dto.request.ReservationHistoryRequestDto;
import com.awantunai.dto.response.ResponseDTO;

public interface OrderService {
    ResponseDTO bookTable(BookTableRequestDto bookTableRequestDto);

    ResponseDTO orderHistory(OrderHistoryRequestDto orderHistoryRequestDto);

    ResponseDTO reservationHistory(ReservationHistoryRequestDto reservationHistoryRequestDto);

    ResponseDTO placeOrder(OrderRequestDto orderRequestDto);
}
