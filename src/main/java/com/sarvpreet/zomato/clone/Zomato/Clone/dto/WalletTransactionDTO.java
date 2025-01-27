package com.sarvpreet.zomato.clone.Zomato.Clone.dto;

import com.sarvpreet.zomato.clone.Zomato.Clone.entities.CustomerOrder;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.Wallet;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.enums.TransactionMethod;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.enums.TransactionType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WalletTransactionDTO {

    private Long id;
    private WalletDTO wallet;
    private Double amount;
    private TransactionType transactionType;
    private TransactionMethod transactionMethod;
    private CustomerOrderDTO order;
    private LocalDateTime transactionTime;
}
