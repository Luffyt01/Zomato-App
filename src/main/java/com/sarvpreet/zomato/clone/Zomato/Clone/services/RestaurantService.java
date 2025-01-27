package com.sarvpreet.zomato.clone.Zomato.Clone.services;

import com.sarvpreet.zomato.clone.Zomato.Clone.entities.Restaurant;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.RestaurantOwner;
import org.springframework.data.domain.Page;

public interface RestaurantService {

    Restaurant getRestaurantById(Long restaurantId);

    Restaurant createNewRestaurant(Restaurant restaurant, RestaurantOwner restaurantOwner);

    Restaurant getRestaurantByOwner(RestaurantOwner restaurantOwner);

    Restaurant updateRestaurantDetails(Restaurant restaurant, Long restaurantId);

    Restaurant updateRestaurantStatus(Restaurant restaurant, Boolean status);

}
