package com.sarvpreet.zomato.clone.Zomato.Clone.services.impl;

import com.sarvpreet.zomato.clone.Zomato.Clone.entities.CustomerOrder;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.DeliveryRequest;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.enums.DeliveryRequestStatus;
import com.sarvpreet.zomato.clone.Zomato.Clone.services.DeliveryRequestService;
import org.springframework.stereotype.Service;

@Service
public class DeliveryRequestServiceImpl implements DeliveryRequestService {
    @Override
    public DeliveryRequest createDeliveryRequest(CustomerOrder customerOrder) {
        return null;
    }

    @Override
    public DeliveryRequest updateDeliveryRequestStatus(DeliveryRequest deliveryRequest, DeliveryRequestStatus deliveryRequestStatus) {
        return null;
    }

    @Override
    public DeliveryRequest getDeliveryRequestById(Long deliveryRequestId) {
        return null;
    }
}
