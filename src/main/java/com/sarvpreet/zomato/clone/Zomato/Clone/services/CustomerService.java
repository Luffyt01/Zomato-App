package com.sarvpreet.zomato.clone.Zomato.Clone.services;

import com.sarvpreet.zomato.clone.Zomato.Clone.dto.*;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.CartItem;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.Customer;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import javax.xml.stream.Location;

public interface CustomerService {

    CartItemDTO addMenuItemToCart(Long cartItemId, Long cartId, Integer quantity);

    CartItemDTO incrementCartItemQuantity(Long cartItemId, Long cartId, Integer quantity);

    CartItemDTO decrementCartItemQuantity(Long cartItemId, Long cartId, Integer quantity);

    CartDTO removeCartItemFromCart(Long cartItemId, Long cartId);

    void deleteCart(Long cartId);

    OrderRequestDTO placeOrder(OrderRequestDTO orderRequestDTO, Long cartId);

    OrderRequestDTO cancelOrder(Long orderRequestId);

    DeliveryPartnerDTO giveFeedbackToDeliveryPartner(SimpleFeedbackDTO simpleFeedbackDTO, Long customerOrderId);

    RestaurantDTO giveFeedbackToRestaurant(SimpleFeedbackDTO simpleFeedbackDTO, Long customerOrderId);

    MenuItemDTO giveFeedbackToMenuItem(SimpleFeedbackDTO simpleFeedbackDTO, Long customerOrderId);

    Page<CustomerOrderDTO> getAllMyOrders(PageRequest pageRequest);

    Page<WalletTransactionDTO> getAllMyWalletTransactions(PageRequest pageRequest);

    CustomerDTO getMyProfile();

    Customer getCurrentCustomer();

    CartDTO getCartById();

    Page<RestaurantDTO> getAllNearByRestaurants(PageRequest pageRequest);

    Customer createNewCustomer(User user);

    CustomerDTO updateMyLocation(PointDTO address);

}
