package com.projects.ebankbackend.dtos;

import com.projects.ebankbackend.enums.AccountStatus;
import lombok.Data;

import java.util.Date;
@Data
public class CurrentBankAccountDTO extends BankAccountDTO {
    private String id;
    private double balance;
    private Date createdAt;
    private AccountStatus status;
    private CustomerDTO customerDTO;
    private double overDraft;

}
