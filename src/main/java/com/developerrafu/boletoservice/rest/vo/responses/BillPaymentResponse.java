package com.developerrafu.boletoservice.rest.vo.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BillPaymentResponse {
    private String code;
    @JsonProperty("due_date")
    private String dueDate;
    private BigDecimal amount;
    @JsonProperty("recipient_document")
    private String recipientName;
    private String type;
}
