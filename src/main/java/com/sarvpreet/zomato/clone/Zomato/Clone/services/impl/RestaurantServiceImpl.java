package com.sarvpreet.zomato.clone.Zomato.Clone.services.impl;

import com.sarvpreet.zomato.clone.Zomato.Clone.entities.Restaurant;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.RestaurantOwner;
import com.sarvpreet.zomato.clone.Zomato.Clone.services.RestaurantService;
import org.springframework.stereotype.Service;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    @Override
    public Restaurant getRestaurantById(Long restaurantId) {
        return null;
    }

    @Override
    public Restaurant createNewRestaurant(Restaurant restaurant, RestaurantOwner restaurantOwner) {
        return null;
    }

    @Override
    public Restaurant getRestaurantByOwner(RestaurantOwner restaurantOwner) {
        return null;
    }

    @Override
    public Restaurant updateRestaurantDetails(Restaurant restaurant, Long restaurantId) {
        return null;
    }

    @Override
    public Restaurant updateRestaurantStatus(Restaurant restaurant, Boolean status) {
        return null;
    }
}
