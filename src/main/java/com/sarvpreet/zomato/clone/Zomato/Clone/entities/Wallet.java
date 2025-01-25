package com.sarvpreet.zomato.clone.Zomato.Clone.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private User user;
    private Double balance;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "wallet_transaction_id")
    private List<WalletTransaction> transactions;
}
