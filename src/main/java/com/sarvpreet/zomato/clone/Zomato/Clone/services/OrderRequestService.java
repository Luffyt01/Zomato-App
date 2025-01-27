package com.sarvpreet.zomato.clone.Zomato.Clone.services;

import com.sarvpreet.zomato.clone.Zomato.Clone.entities.Cart;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.OrderRequest;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.enums.OrderRequestStatus;

public interface OrderRequestService {

    OrderRequest createNewOrderRequest(OrderRequest orderRequest);

    OrderRequest cancelOrderRequest(OrderRequest orderRequest);

    OrderRequest updateOrderRequestStatus(OrderRequest orderRequest, OrderRequestStatus orderRequestStatus);

    OrderRequest getOrderRequestById(Long orderRequestId);

    OrderRequest getOrderRequestByCart(Cart cart);
}
