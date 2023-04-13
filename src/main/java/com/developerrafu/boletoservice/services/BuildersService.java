package com.developerrafu.boletoservice.services;

import com.developerrafu.boletoservice.domain.BillPayment;
import com.developerrafu.boletoservice.mappers.BillPaymentMapper;
import com.developerrafu.boletoservice.mappers.TokenMapper;
import com.developerrafu.boletoservice.properties.SecretProperties;
import com.developerrafu.boletoservice.rest.clients.BuildersClient;
import com.developerrafu.boletoservice.domain.Token;
import com.developerrafu.boletoservice.rest.vo.requests.AuthRequest;
import com.developerrafu.boletoservice.rest.vo.requests.BillPaymentRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class BuildersService {
    private final BuildersClient client;
    private final SecretProperties properties;
    private final TokenMapper tokenMapper;
    private final BillPaymentMapper mapper;

    public Token auth() {
        final var request = AuthRequest.builder().clientId(properties.getId()).clientSecret(properties.getSecret()).build();
        return tokenMapper.toToken(client.auth(request));
    }

    public BillPayment validateBill(final String billCode) {
        return mapper.toBillPayment(client.postCode(BillPaymentRequest.builder().code(billCode).build()));
    }
}
