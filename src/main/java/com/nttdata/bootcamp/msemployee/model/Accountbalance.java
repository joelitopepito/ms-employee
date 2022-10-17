package com.nttdata.bootcamp.msemployee.model;

import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("accountbalance")


public class Accountbalance {
    @Id
    private String account_number;
    private String available_balance;
}
