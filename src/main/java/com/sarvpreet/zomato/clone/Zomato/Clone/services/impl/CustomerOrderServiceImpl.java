package com.sarvpreet.zomato.clone.Zomato.Clone.services.impl;


import com.sarvpreet.zomato.clone.Zomato.Clone.dto.CustomerOrderDTO;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.Customer;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.CustomerOrder;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.OrderRequest;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.enums.CustomerOrderStatus;
import com.sarvpreet.zomato.clone.Zomato.Clone.services.CustomerOrderService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class CustomerOrderServiceImpl implements CustomerOrderService {
    @Override
    public CustomerOrder createNewCustomerOrder(OrderRequest orderRequest, Integer estimatedPreparationTime) {
        return null;
    }

    @Override
    public CustomerOrder updateCustomerOrderStatus(CustomerOrder customerOrder, CustomerOrderStatus customerOrderStatus) {
        return null;
    }

    @Override
    public CustomerOrder getCustomerOrderById(Long customerOrderId) {
        return null;
    }

    @Override
    public Page<CustomerOrderDTO> getAllCustomerOrders(Customer customer, PageRequest pageRequest) {
        return null;
    }
}
