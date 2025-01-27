package com.sarvpreet.zomato.clone.Zomato.Clone.services;
import com.sarvpreet.zomato.clone.Zomato.Clone.dto.CartItemDTO;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.Cart;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.Customer;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.Restaurant;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.enums.CartStatus;

import java.util.*;

public interface CartService {

    List<CartItemDTO> getAllCartItems(Long cartId);

    Cart getCartById(Long cartId);

    Cart createNewCart(Restaurant restaurant, Customer customer);

    Cart updateCartStatus(Cart cart, CartStatus cartStatus);

    void deleteCart(Long cartId);
}
