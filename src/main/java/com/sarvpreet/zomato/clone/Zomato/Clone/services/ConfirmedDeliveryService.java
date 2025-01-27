package com.sarvpreet.zomato.clone.Zomato.Clone.services;

import com.sarvpreet.zomato.clone.Zomato.Clone.dto.ConfirmedDeliveryDTO;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.ConfirmedDelivery;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.DeliveryPartner;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.DeliveryRequest;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.enums.ConfirmedDeliveryStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface ConfirmedDeliveryService {

    ConfirmedDeliveryDTO createConfirmedDelivery(DeliveryRequest deliveryRequest, DeliveryPartner deliveryPartner);

    ConfirmedDeliveryDTO updateConfirmedDeliveryStatus(ConfirmedDelivery confirmedDelivery, ConfirmedDeliveryStatus confirmedDeliveryStatus);

    ConfirmedDelivery getConfirmedDeliveryById(Long confirmedDeliveryId);

    Page<ConfirmedDelivery> getConfirmedDeliveriesByDeliveryPartner(DeliveryPartner deliveryPartner, PageRequest pageRequest);

}
