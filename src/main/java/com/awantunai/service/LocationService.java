package com.awantunai.service;

import com.awantunai.dto.response.ResponseDTO;

public interface LocationService {
    ResponseDTO pollOrderLocation(String orderId);
}
