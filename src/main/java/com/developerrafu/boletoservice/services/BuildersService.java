package com.developerrafu.boletoservice.services;

import com.developerrafu.boletoservice.mappers.TokenMapper;
import com.developerrafu.boletoservice.properties.SecretProperties;
import com.developerrafu.boletoservice.rest.clients.BuildersClient;
import com.developerrafu.boletoservice.domain.Token;
import com.developerrafu.boletoservice.rest.vo.requests.AuthRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class BuildersService {
    private final BuildersClient client;
    private final SecretProperties properties;
    private final TokenMapper mapper;

    public Token auth() {
        final var request = AuthRequest.builder().clientId(properties.getId()).clientSecret(properties.getSecret()).build();
        return mapper.toToken(client.auth(request));
    }

}
