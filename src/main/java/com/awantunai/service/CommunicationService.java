package com.awantunai.service;

import com.awantunai.dto.request.CommunicationRequest;
import com.awantunai.dto.response.ResponseDTO;

public interface CommunicationService {
    ResponseDTO sendEmail(CommunicationRequest commRequest);

    ResponseDTO sendSms(CommunicationRequest commRequest);

    ResponseDTO sendBoth(CommunicationRequest commRequest);

}
