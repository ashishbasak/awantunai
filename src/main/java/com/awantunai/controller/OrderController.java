package com.awantunai.controller;

import com.awantunai.dto.request.BookTableRequestDto;
import com.awantunai.dto.request.OrderHistoryRequestDto;
import com.awantunai.dto.request.OrderRequestDto;
import com.awantunai.dto.request.ReservationHistoryRequestDto;
import com.awantunai.dto.response.ResponseDTO;
import com.awantunai.service.OrderService;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

//order services like book table, order history, reservation history, place order
@RestController
@RequestMapping("/${base.version}/order")
@CrossOrigin
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/bookTable")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong")})
    public ResponseDTO bookTable(@RequestBody BookTableRequestDto bookTableRequestDto, HttpServletRequest request) {
        return orderService.bookTable(bookTableRequestDto);
    }

    @PostMapping("/sendEmail")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong")})
    public ResponseDTO orderHistory(@RequestBody OrderHistoryRequestDto orderHistoryRequestDto, HttpServletRequest request) {
        return orderService.orderHistory(orderHistoryRequestDto);
    }

    @PostMapping("/sendEmail")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong")})
    public ResponseDTO reservationHistory(@RequestBody ReservationHistoryRequestDto reservationHistoryRequestDto, HttpServletRequest request) {
        return orderService.reservationHistory(reservationHistoryRequestDto);
    }

    @PostMapping("/sendEmail")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong")})
    public ResponseDTO placeOrder(@RequestBody OrderRequestDto orderRequestDto, HttpServletRequest request) {
        return orderService.placeOrder(orderRequestDto);
    }

}
