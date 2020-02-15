package com.awantunai.controller;

import com.awantunai.dto.request.RestaurantDetailsRequest;
import com.awantunai.dto.request.SearchRequest;
import com.awantunai.dto.response.ResponseDTO;
import com.awantunai.service.PaymentService;
import com.awantunai.service.SearchService;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

//Realtime search results according to location of the user and give restaurants, images , contact details, food menus, ratings, price, restaurantType
@RestController
@RequestMapping("/${base.version}/search")
@CrossOrigin
public class SearchController {

    private SearchService searchService;

    @PostMapping("/restaurants")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong")})
    public ResponseDTO getRestaurants(@RequestBody SearchRequest searchRequest, HttpServletRequest request) {
        return searchService.getRestaurants(searchRequest);
    }

    @PostMapping("/restaurantDetails")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong")})
    public ResponseDTO getRestaurantDetails(@RequestBody RestaurantDetailsRequest restaurantDetailsRequest, HttpServletRequest request) {
        return searchService.getRestaurantDetails(restaurantDetailsRequest);
    }
    
    
}
