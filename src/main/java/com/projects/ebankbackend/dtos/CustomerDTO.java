package com.projects.ebankbackend.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.projects.ebankbackend.entities.BankAccount;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
public class CustomerDTO {
    private Long id;
    private String name;
    private String email;
}
