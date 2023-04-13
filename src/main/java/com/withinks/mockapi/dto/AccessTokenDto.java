package com.withinks.mockapi.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * @author mofizhaider
 * @since 4/13/23
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record AccessTokenDto(AccessInformation body) implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
}