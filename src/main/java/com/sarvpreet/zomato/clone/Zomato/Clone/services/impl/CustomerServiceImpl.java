package com.sarvpreet.zomato.clone.Zomato.Clone.services.impl;

import com.sarvpreet.zomato.clone.Zomato.Clone.dto.*;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.Customer;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.User;
import com.sarvpreet.zomato.clone.Zomato.Clone.services.CustomerService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CartItemDTO addMenuItemToCart(Long cartItemId, Long cartId, Integer quantity) {
        return null;
    }

    @Override
    public CartItemDTO incrementCartItemQuantity(Long cartItemId, Long cartId, Integer quantity) {
        return null;
    }

    @Override
    public CartItemDTO decrementCartItemQuantity(Long cartItemId, Long cartId, Integer quantity) {
        return null;
    }

    @Override
    public CartDTO removeCartItemFromCart(Long cartItemId, Long cartId) {
        return null;
    }

    @Override
    public void deleteCart(Long cartId) {

    }

    @Override
    public OrderRequestDTO placeOrder(OrderRequestDTO orderRequestDTO, Long cartId) {
        return null;
    }

    @Override
    public OrderRequestDTO cancelOrder(Long orderRequestId) {
        return null;
    }

    @Override
    public DeliveryPartnerDTO giveFeedbackToDeliveryPartner(SimpleFeedbackDTO simpleFeedbackDTO, Long customerOrderId) {
        return null;
    }

    @Override
    public RestaurantDTO giveFeedbackToRestaurant(SimpleFeedbackDTO simpleFeedbackDTO, Long customerOrderId) {
        return null;
    }

    @Override
    public MenuItemDTO giveFeedbackToMenuItem(SimpleFeedbackDTO simpleFeedbackDTO, Long customerOrderId) {
        return null;
    }

    @Override
    public Page<CustomerOrderDTO> getAllMyOrders(PageRequest pageRequest) {
        return null;
    }

    @Override
    public Page<WalletTransactionDTO> getAllMyWalletTransactions(PageRequest pageRequest) {
        return null;
    }

    @Override
    public CustomerDTO getMyProfile() {
        return null;
    }

    @Override
    public Customer getCurrentCustomer() {
        return null;
    }

    @Override
    public CartDTO getCartById() {
        return null;
    }

    @Override
    public Page<RestaurantDTO> getAllNearByRestaurants(PageRequest pageRequest) {
        return null;
    }

    @Override
    public Customer createNewCustomer(User user) {
        return null;
    }

    @Override
    public CustomerDTO updateMyLocation(PointDTO address) {
        return null;
    }
}
