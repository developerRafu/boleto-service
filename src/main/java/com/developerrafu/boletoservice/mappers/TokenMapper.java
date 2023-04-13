package com.developerrafu.boletoservice.mappers;

import com.developerrafu.boletoservice.rest.vo.responses.TokenResponse;
import com.developerrafu.boletoservice.domain.Token;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TokenMapper {
    Token toToken(final TokenResponse tokenResponse);
}
