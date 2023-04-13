package com.developerrafu.boletoservice.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Token {
    private String token;
    private LocalDateTime expiresIn;
}
