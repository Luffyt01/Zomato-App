package com.sarvpreet.zomato.clone.Zomato.Clone.services;

import com.sarvpreet.zomato.clone.Zomato.Clone.entities.ConfirmedDelivery;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.CustomerOrder;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.Payment;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.enums.PaymentMethod;

public interface PaymentService {

    void createNewPayment(CustomerOrder customerOrder);

    void processPayment(ConfirmedDelivery confirmedDelivery);
}
