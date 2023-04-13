package com.developerrafu.boletoservice.rest.vo.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class TokenResponse {
    private String token;
    @JsonProperty("expires_in")
    private LocalDateTime expiresIn;
}
