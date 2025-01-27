package com.sarvpreet.zomato.clone.Zomato.Clone.services.impl;

import com.sarvpreet.zomato.clone.Zomato.Clone.dto.CartItemDTO;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.Cart;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.Customer;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.Restaurant;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.enums.CartStatus;
import com.sarvpreet.zomato.clone.Zomato.Clone.services.CartService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    @Override
    public List<CartItemDTO> getAllCartItems(Long cartId) {
        return List.of();
    }

    @Override
    public Cart getCartById(Long cartId) {
        return null;
    }

    @Override
    public Cart createNewCart(Restaurant restaurant, Customer customer) {
        return null;
    }

    @Override
    public Cart updateCartStatus(Cart cart, CartStatus cartStatus) {
        return null;
    }

    @Override
    public void deleteCart(Long cartId) {

    }
}
