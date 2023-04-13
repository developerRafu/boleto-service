package com.developerrafu.boletoservice.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class BillPayment {
    private String code;
    private LocalDate dueDate;
    private BigDecimal amount;
    private String recipientName;
    private String type;
}
