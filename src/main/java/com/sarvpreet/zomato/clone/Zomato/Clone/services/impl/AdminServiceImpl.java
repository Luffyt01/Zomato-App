package com.sarvpreet.zomato.clone.Zomato.Clone.services.impl;

import com.sarvpreet.zomato.clone.Zomato.Clone.dto.DeliveryPartnerDTO;
import com.sarvpreet.zomato.clone.Zomato.Clone.dto.RestaurantDTO;
import com.sarvpreet.zomato.clone.Zomato.Clone.services.AdminService;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Override
    public RestaurantDTO onBoardRestaurantOwner(Long userId, Long aadharNo) {
        return null;
    }

    @Override
    public DeliveryPartnerDTO onBoardDeliveryPartner(Long userId, Long aadharNo, String vehicleId) {
        return null;
    }
}
