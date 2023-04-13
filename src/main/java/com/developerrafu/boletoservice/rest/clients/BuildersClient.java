package com.developerrafu.boletoservice.rest.clients;

import com.developerrafu.boletoservice.rest.vo.requests.BillPaymentRequest;
import com.developerrafu.boletoservice.rest.vo.responses.BillPaymentResponse;
import com.developerrafu.boletoservice.rest.vo.responses.TokenResponse;
import com.developerrafu.boletoservice.rest.vo.requests.AuthRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "builders-api", url = "${services.builder.api}")
public interface BuildersClient {
    @PostMapping("auth/tokens")
    TokenResponse auth(@RequestBody AuthRequest request);

    @PostMapping("bill-payments/codes")
    BillPaymentResponse postCode(@RequestBody BillPaymentRequest request);
}
