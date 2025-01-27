package com.sarvpreet.zomato.clone.Zomato.Clone.services.impl;

import com.sarvpreet.zomato.clone.Zomato.Clone.dto.*;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.RestaurantOwner;
import com.sarvpreet.zomato.clone.Zomato.Clone.services.RestaurantOwnerService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class RestaurantOwnerServiceImpl implements RestaurantOwnerService {

    @Override
    public RestaurantDTO createNewRestaurant(RestaurantDTO restaurantDTO) {
        return null;
    }

    @Override
    public RestaurantDTO updateRestaurantDetails(RestaurantDTO restaurantDTO, Long restaurantId) {
        return null;
    }

    @Override
    public CustomerOrderDTO acceptCustomerOrder(Long orderRequestId, Integer estimatedPreparationTime) {
        return null;
    }

    @Override
    public OrderRequestDTO cancelOrderRequest(Long orderRequestId) {
        return null;
    }

    @Override
    public MenuDTO createMenuForRestaurant(MenuDTO menuDTO, Long restaurantId) {
        return null;
    }

    @Override
    public MenuDTO updateMenuOfRestaurant(MenuDTO menuDTO, Long menuId) {
        return null;
    }

    @Override
    public MenuItemDTO creatMenuItemForMenu(MenuItemDTO menuItemDTO, Long menuId) {
        return null;
    }

    @Override
    public MenuItemDTO updateMenuItemOfMenu(MenuItemDTO menuItemDTO, Long menuItemId) {
        return null;
    }

    @Override
    public ConfirmedDeliveryDTO startDelivery(Long confirmedDeliveryId, String pickUpOtp) {
        return null;
    }

    @Override
    public RestaurantOwner getCurrentRestaurantOwner() {
        return null;
    }

    @Override
    public RestaurantDTO updateRestaurantStatus(RestaurantStatusDTO restaurantStatusDTO, Long restaurantId) {
        return null;
    }

    @Override
    public MenuDTO updateMenuStatus(MenuItemStatusDTO menuItemStatusDTO, Long menuItemId) {
        return null;
    }

    @Override
    public MenuItemDTO updateMenuItemStatus(MenuItemStatusDTO menuItemStatusDTO, Long menuId) {
        return null;
    }

    @Override
    public Page<WalletTransactionDTO> getWalletTransactions(PageRequest pageRequest) {
        return null;
    }
}
