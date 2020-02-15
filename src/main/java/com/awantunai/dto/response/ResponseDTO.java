package com.awantunai.dto.response;

import com.airtelbank.portal.b2binterface.dto.CustomError;
import com.airtelbank.portal.b2binterface.model.Meta;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * a generic response dto for endpoints
 *
 * @param <T> the type parameter
 */
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseDTO<T> {

    /**
     * the response metadata
     */
	@ApiModelProperty(notes = "Metadata of the response generated")
    private Meta meta;

    /**
     * the response recieved
     */
	@ApiModelProperty(notes = "Generic data field which encapsulates the response from the service")
	private T data;

	/**
	 * The Errors.
	 */
	@ApiModelProperty(notes = "Validation errors that the request failed")
	List<CustomError> errors;

	/**
	 * Instantiates a new Response dto.
	 *
	 * @param meta the meta
	 */
	public ResponseDTO(Meta meta) {
        this.meta = meta;
    }
}
