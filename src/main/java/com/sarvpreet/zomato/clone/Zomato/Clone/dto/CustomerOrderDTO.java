package com.sarvpreet.zomato.clone.Zomato.Clone.dto;

import com.sarvpreet.zomato.clone.Zomato.Clone.entities.Cart;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.Customer;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.Restaurant;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.enums.CustomerOrderStatus;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.enums.PaymentMethod;
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
public class CustomerOrderDTO {

    private Long id;
    private CartDTO cart;
    private Double totalAmount;
    private Double deliveryCharges;
    private Double platformFee;
    private Double grandTotal;
    private RestaurantDTO restaurant;
    private CustomerDTO customer;
    private Integer estimatedPreparationTime;
    private PaymentMethod paymentMethod;
    private CustomerOrderStatus status;
    private String otp;
    private LocalDateTime orderAcceptedTime;
}
