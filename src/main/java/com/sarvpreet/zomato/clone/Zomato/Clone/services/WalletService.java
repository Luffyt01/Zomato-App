package com.sarvpreet.zomato.clone.Zomato.Clone.services;

import com.sarvpreet.zomato.clone.Zomato.Clone.entities.CustomerOrder;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.User;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.Wallet;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.enums.TransactionMethod;

public interface WalletService {

    Wallet getWalletById(Long walletId);

    Wallet addMoneyToWallet(User user, Double amount, String transactionId, CustomerOrder customerOrder, TransactionMethod transactionMethod);

    Wallet deductMoneyFromWallet(User user, Double amount, String transactionId, CustomerOrder customerOrder, TransactionMethod transactionMethod);

    void withdrawAllMyMoneyFromWallet();

    Wallet createNewWallet(User user);

    Wallet getWalletByUser(User user);
}
