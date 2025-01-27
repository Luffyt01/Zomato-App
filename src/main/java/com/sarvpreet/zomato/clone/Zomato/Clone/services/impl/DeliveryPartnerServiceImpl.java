package com.sarvpreet.zomato.clone.Zomato.Clone.services.impl;


import com.sarvpreet.zomato.clone.Zomato.Clone.dto.*;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.DeliveryPartner;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.WalletTransaction;
import com.sarvpreet.zomato.clone.Zomato.Clone.services.DeliveryPartnerService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class DeliveryPartnerServiceImpl implements DeliveryPartnerService {

    @Override
    public ConfirmedDeliveryDTO acceptDeliveryRequest(Long deliveryRequestId) {
        return null;
    }

    @Override
    public ConfirmedDeliveryDTO cancelDeliveryRequest(Long deliveryRequestId) {
        return null;
    }

    @Override
    public ConfirmedDeliveryDTO completedDeliveryRequest(Long confirmedDeliveryId, String otp) {
        return null;
    }

    @Override
    public DeliveryPartnerDTO getMyProfile() {
        return null;
    }

    @Override
    public Page<DeliveryRequestDTO> getAllMyDeliveryRequests(PageRequest pageRequest) {
        return null;
    }

    @Override
    public Page<WalletTransaction> getAllMyWalletTransactions(PageRequest pageRequest) {
        return null;
    }

    @Override
    public DeliveryPartner getCurrentDeliveryPartner() {
        return null;
    }

    @Override
    public DeliveryPartner updateDeliveryPartnerAvailability(DeliveryPartner deliveryPartner, Boolean availability) {
        return null;
    }

    @Override
    public CustomerDTO giveFeedbackToCustomer(SimpleFeedbackDTO simpleFeedbackDTO, Long confirmedDeliveryId) {
        return null;
    }

    @Override
    public DeliveryPartner createNewDeliveryPartner(DeliveryPartner deliveryPartner) {
        return null;
    }

    @Override
    public DeliveryPartnerDTO updateMyLocation(PointDTO address) {
        return null;
    }
}
