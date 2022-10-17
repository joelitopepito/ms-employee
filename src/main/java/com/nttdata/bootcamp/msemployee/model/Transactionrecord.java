package com.nttdata.bootcamp.msemployee.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("transactionrecord")
public class Transactionrecord {
    @Id
    private String account_number;
    private String transaction_type;
    private String document_type;
    private String document_number;
    private String transaction_amount;
    private String transaction_date;
    private String transaction_time;
}
