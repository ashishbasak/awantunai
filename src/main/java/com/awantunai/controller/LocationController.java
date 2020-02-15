package com.awantunai.controller;

import com.awantunai.dto.response.ResponseDTO;
import com.awantunai.service.LocationService;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

//Live location of food and customer
@RestController
@RequestMapping("/${base.version}/location")
@CrossOrigin
public class LocationController {

    @Autowired
    private LocationService locationService;

    @GetMapping("/order/{orderId}")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong")})
    public ResponseDTO orderLocation(@PathVariable String orderId, HttpServletRequest request) {
        return locationService.pollOrderLocation(orderId);
    }


}
