package com.developerrafu.boletoservice.mappers;

import com.developerrafu.boletoservice.domain.BillPayment;
import com.developerrafu.boletoservice.domain.Token;
import com.developerrafu.boletoservice.rest.vo.responses.BillPaymentResponse;
import com.developerrafu.boletoservice.rest.vo.responses.TokenResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BillPaymentMapper {
    BillPayment toBillPayment(final BillPaymentResponse response);
}
