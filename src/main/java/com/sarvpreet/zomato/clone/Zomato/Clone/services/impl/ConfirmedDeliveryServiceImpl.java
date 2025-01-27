package com.sarvpreet.zomato.clone.Zomato.Clone.services.impl;

import com.sarvpreet.zomato.clone.Zomato.Clone.dto.ConfirmedDeliveryDTO;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.ConfirmedDelivery;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.DeliveryPartner;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.DeliveryRequest;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.enums.ConfirmedDeliveryStatus;
import com.sarvpreet.zomato.clone.Zomato.Clone.services.ConfirmedDeliveryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class ConfirmedDeliveryServiceImpl implements ConfirmedDeliveryService {
    @Override
    public ConfirmedDeliveryDTO createConfirmedDelivery(DeliveryRequest deliveryRequest, DeliveryPartner deliveryPartner) {
        return null;
    }

    @Override
    public ConfirmedDeliveryDTO updateConfirmedDeliveryStatus(ConfirmedDelivery confirmedDelivery, ConfirmedDeliveryStatus confirmedDeliveryStatus) {
        return null;
    }

    @Override
    public ConfirmedDelivery getConfirmedDeliveryById(Long confirmedDeliveryId) {
        return null;
    }

    @Override
    public Page<ConfirmedDelivery> getConfirmedDeliveriesByDeliveryPartner(DeliveryPartner deliveryPartner, PageRequest pageRequest) {
        return null;
    }
}
