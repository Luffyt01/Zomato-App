package com.sarvpreet.zomato.clone.Zomato.Clone.services;

import com.sarvpreet.zomato.clone.Zomato.Clone.dto.CartItemDTO;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.Cart;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.CartItem;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.MenuItem;

public interface CartItemService {

    CartItem getCartItemById(Long cartItemId);

    CartItem createNewCartItem(MenuItem menuItem, Cart cart);

}
