package com.sarvpreet.zomato.clone.Zomato.Clone.services;

import com.sarvpreet.zomato.clone.Zomato.Clone.dto.CustomerOrderDTO;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.Customer;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.CustomerOrder;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.OrderRequest;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.enums.CustomerOrderStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface CustomerOrderService {

    CustomerOrder createNewCustomerOrder(OrderRequest orderRequest, Integer estimatedPreparationTime);

    CustomerOrder updateCustomerOrderStatus(CustomerOrder customerOrder, CustomerOrderStatus customerOrderStatus);

    CustomerOrder getCustomerOrderById(Long customerOrderId);

    Page<CustomerOrderDTO> getAllCustomerOrders(Customer customer, PageRequest pageRequest);
}
