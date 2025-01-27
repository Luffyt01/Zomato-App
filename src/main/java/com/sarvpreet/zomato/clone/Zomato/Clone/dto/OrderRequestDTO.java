package com.sarvpreet.zomato.clone.Zomato.Clone.dto;

import com.sarvpreet.zomato.clone.Zomato.Clone.entities.Cart;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.Customer;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.Restaurant;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.enums.OrderRequestStatus;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.enums.PaymentMethod;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequestDTO {

    private Long id;
    private CartDTO cart;
    private Double deliveryCharges;
    private Double platformFee;
    private Double grandTotal;
    private OrderRequestStatus status;
    private RestaurantDTO restaurant;
    private CustomerDTO customer;
    private PaymentMethod paymentMethod;
}
