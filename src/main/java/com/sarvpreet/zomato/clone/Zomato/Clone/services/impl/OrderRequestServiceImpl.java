package com.sarvpreet.zomato.clone.Zomato.Clone.services.impl;

import com.sarvpreet.zomato.clone.Zomato.Clone.entities.Cart;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.OrderRequest;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.enums.OrderRequestStatus;
import com.sarvpreet.zomato.clone.Zomato.Clone.services.OrderRequestService;
import org.springframework.stereotype.Service;

@Service
public class OrderRequestServiceImpl implements OrderRequestService {
    @Override
    public OrderRequest createNewOrderRequest(OrderRequest orderRequest) {
        return null;
    }

    @Override
    public OrderRequest cancelOrderRequest(OrderRequest orderRequest) {
        return null;
    }

    @Override
    public OrderRequest updateOrderRequestStatus(OrderRequest orderRequest, OrderRequestStatus orderRequestStatus) {
        return null;
    }

    @Override
    public OrderRequest getOrderRequestById(Long orderRequestId) {
        return null;
    }

    @Override
    public OrderRequest getOrderRequestByCart(Cart cart) {
        return null;
    }
}
