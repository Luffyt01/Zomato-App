package com.sarvpreet.zomato.clone.Zomato.Clone.services.impl;

import com.sarvpreet.zomato.clone.Zomato.Clone.entities.Cart;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.CartItem;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.MenuItem;
import com.sarvpreet.zomato.clone.Zomato.Clone.services.CartItemService;
import org.springframework.stereotype.Service;

@Service
public class CartItemServiceImpl implements CartItemService {


    @Override
    public CartItem getCartItemById(Long cartItemId) {
        return null;
    }

    @Override
    public CartItem createNewCartItem(MenuItem menuItem, Cart cart) {
        return null;
    }
}
