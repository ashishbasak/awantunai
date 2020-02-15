package com.awantunai.service;

import com.awantunai.dto.request.RestaurantDetailsRequest;
import com.awantunai.dto.request.SearchRequest;
import com.awantunai.dto.response.ResponseDTO;

public interface SearchService {
    ResponseDTO getRestaurants(SearchRequest searchRequest);

    ResponseDTO getRestaurantDetails(RestaurantDetailsRequest restaurantDetailsRequest);
}
