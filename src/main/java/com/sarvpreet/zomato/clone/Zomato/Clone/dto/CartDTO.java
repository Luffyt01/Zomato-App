package com.sarvpreet.zomato.clone.Zomato.Clone.dto;

import com.sarvpreet.zomato.clone.Zomato.Clone.entities.CartItem;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.Customer;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.Restaurant;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.enums.CartStatus;
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
public class CartDTO {

    private Long id;
    private String cartName;
    private List<CartItemDTO> cartItems;
    private CartDTO customer;
    private RestaurantDTO restaurant;
    private Double totalAmount;
    private CartStatus status;
}
