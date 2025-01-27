package com.sarvpreet.zomato.clone.Zomato.Clone.services.impl;

import com.sarvpreet.zomato.clone.Zomato.Clone.entities.Menu;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.Restaurant;
import com.sarvpreet.zomato.clone.Zomato.Clone.services.MenuService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Override
    public Menu createRestaurantMenu(Menu menu, Restaurant restaurant) {
        return null;
    }

    @Override
    public Menu updateMenuActiveStatus(Menu menu, Boolean status) {
        return null;
    }

    @Override
    public Menu getMenuById(Long menuId) {
        return null;
    }

    @Override
    public List<Menu> getAllMenusForRestaurant(Restaurant restaurant) {
        return List.of();
    }

    @Override
    public Menu updateMenuOfRestaurant(Menu menu, Long id) {
        return null;
    }
}
