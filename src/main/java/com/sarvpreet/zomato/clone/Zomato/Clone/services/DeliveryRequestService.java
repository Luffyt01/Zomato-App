package com.sarvpreet.zomato.clone.Zomato.Clone.services;

import com.sarvpreet.zomato.clone.Zomato.Clone.dto.DeliveryRequestDTO;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.CustomerOrder;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.DeliveryRequest;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.enums.DeliveryRequestStatus;

public interface DeliveryRequestService {

    DeliveryRequest createDeliveryRequest(CustomerOrder customerOrder);

    DeliveryRequest updateDeliveryRequestStatus(DeliveryRequest deliveryRequest, DeliveryRequestStatus deliveryRequestStatus);

    DeliveryRequest getDeliveryRequestById(Long deliveryRequestId);
}
