package com.sarvpreet.zomato.clone.Zomato.Clone.services;

import com.sarvpreet.zomato.clone.Zomato.Clone.entities.Menu;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.Restaurant;

import java.util.List;

public interface MenuService {

    Menu createRestaurantMenu(Menu menu, Restaurant restaurant);

    Menu updateMenuActiveStatus(Menu menu, Boolean status);

    Menu getMenuById(Long menuId);

    List<Menu> getAllMenusForRestaurant(Restaurant restaurant);

    Menu updateMenuOfRestaurant(Menu menu, Long id);
}
