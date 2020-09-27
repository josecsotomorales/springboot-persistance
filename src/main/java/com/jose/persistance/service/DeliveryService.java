package com.jose.persistance.service;

import com.jose.persistance.data.Delivery;
import com.jose.persistance.repository.DeliveryRepository;
import com.jose.persistance.repository.RecipientAndPrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryService {
    @Autowired
    DeliveryRepository deliveryRepository;

    public Long save(Delivery delivery) {
        delivery.getPlants().forEach(plant -> plant.setDelivery(delivery));
        deliveryRepository.persist(delivery);
        return delivery.getId();
    }

    public List<Delivery> getAllByName(String name) {
        return deliveryRepository.findByName(name);
    }

    public Delivery getById(Long id) {
        return deliveryRepository.find(id);
    }

    public RecipientAndPrice getBill(Long deliveryId){
        return deliveryRepository.getBill(deliveryId);
    }

}
