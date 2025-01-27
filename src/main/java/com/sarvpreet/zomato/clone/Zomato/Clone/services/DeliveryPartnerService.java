package com.sarvpreet.zomato.clone.Zomato.Clone.services;

import com.sarvpreet.zomato.clone.Zomato.Clone.dto.*;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.ConfirmedDelivery;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.DeliveryPartner;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.DeliveryRequest;
import com.sarvpreet.zomato.clone.Zomato.Clone.entities.WalletTransaction;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface DeliveryPartnerService {

    ConfirmedDeliveryDTO acceptDeliveryRequest(Long deliveryRequestId);

    ConfirmedDeliveryDTO cancelDeliveryRequest(Long deliveryRequestId);

    ConfirmedDeliveryDTO completedDeliveryRequest(Long confirmedDeliveryId, String otp);

    DeliveryPartnerDTO getMyProfile();

    Page<DeliveryRequestDTO> getAllMyDeliveryRequests(PageRequest pageRequest);

    Page<WalletTransaction> getAllMyWalletTransactions(PageRequest pageRequest);

    DeliveryPartner getCurrentDeliveryPartner();

    DeliveryPartner updateDeliveryPartnerAvailability(DeliveryPartner deliveryPartner, Boolean availability);

    CustomerDTO giveFeedbackToCustomer(SimpleFeedbackDTO simpleFeedbackDTO, Long confirmedDeliveryId);

    DeliveryPartner createNewDeliveryPartner(DeliveryPartner deliveryPartner);

    DeliveryPartnerDTO updateMyLocation(PointDTO address);
}
