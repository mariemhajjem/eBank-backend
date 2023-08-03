package com.projects.ebankbackend.repositories;

import com.projects.ebankbackend.entities.BankAccount;
import com.projects.ebankbackend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
