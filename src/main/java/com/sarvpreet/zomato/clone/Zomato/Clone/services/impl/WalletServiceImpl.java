package com.sarvpreet.zomato.clone.Zomato.Clone.services.impl;

import com.sarvpreet.zomato.clone.Zomato.Clone.entities.CustomerOrder;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.User;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.Wallet;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.enums.TransactionMethod;
import com.sarvpreet.zomato.clone.Zomato.Clone.services.WalletService;
import org.springframework.stereotype.Service;

@Service
public class WalletServiceImpl implements WalletService {
    @Override
    public Wallet getWalletById(Long walletId) {
        return null;
    }

    @Override
    public Wallet addMoneyToWallet(User user, Double amount, String transactionId, CustomerOrder customerOrder, TransactionMethod transactionMethod) {
        return null;
    }

    @Override
    public Wallet deductMoneyFromWallet(User user, Double amount, String transactionId, CustomerOrder customerOrder, TransactionMethod transactionMethod) {
        return null;
    }

    @Override
    public void withdrawAllMyMoneyFromWallet() {

    }

    @Override
    public Wallet createNewWallet(User user) {
        return null;
    }

    @Override
    public Wallet getWalletByUser(User user) {
        return null;
    }
}
