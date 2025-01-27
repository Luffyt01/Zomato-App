package com.sarvpreet.zomato.clone.Zomato.Clone.services;

import com.sarvpreet.zomato.clone.Zomato.Clone.dto.DeliveryPartnerDTO;
import com.sarvpreet.zomato.clone.Zomato.Clone.dto.RestaurantDTO;

public interface AdminService {

    RestaurantDTO onBoardRestaurantOwner(Long userId, Long aadharNo);

    DeliveryPartnerDTO onBoardDeliveryPartner(Long userId, Long aadharNo, String vehicleId);
}
