package com.sarvpreet.zomato.clone.Zomato.Clone.services;

import com.sarvpreet.zomato.clone.Zomato.Clone.dto.*;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.RestaurantOwner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RestaurantOwnerService {

    RestaurantDTO createNewRestaurant(RestaurantDTO restaurantDTO);

    RestaurantDTO updateRestaurantDetails(RestaurantDTO restaurantDTO, Long restaurantId);

    CustomerOrderDTO acceptCustomerOrder(Long orderRequestId, Integer estimatedPreparationTime);

    OrderRequestDTO cancelOrderRequest(Long orderRequestId);

    MenuDTO createMenuForRestaurant(MenuDTO menuDTO, Long restaurantId);

    MenuDTO updateMenuOfRestaurant(MenuDTO menuDTO, Long menuId);

    MenuItemDTO creatMenuItemForMenu(MenuItemDTO menuItemDTO, Long menuId);

    MenuItemDTO updateMenuItemOfMenu(MenuItemDTO menuItemDTO, Long menuItemId);

    ConfirmedDeliveryDTO startDelivery(Long confirmedDeliveryId, String pickUpOtp);

    RestaurantOwner getCurrentRestaurantOwner();

    RestaurantDTO updateRestaurantStatus(RestaurantStatusDTO restaurantStatusDTO, Long restaurantId);

    MenuDTO updateMenuStatus(MenuItemStatusDTO menuItemStatusDTO, Long menuItemId);

    MenuItemDTO updateMenuItemStatus(MenuItemStatusDTO menuItemStatusDTO, Long menuId);

    Page<WalletTransactionDTO> getWalletTransactions(PageRequest pageRequest);

}
