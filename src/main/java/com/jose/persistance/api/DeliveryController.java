package com.jose.persistance.api;

import com.jose.persistance.data.Delivery;
import com.jose.persistance.repository.RecipientAndPrice;
import com.jose.persistance.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {
    @Autowired
    DeliveryService deliveryService;

    @PostMapping
    public Long scheduleDelivery(@RequestBody Delivery delivery) {
        return deliveryService.save(delivery);
    }

    @GetMapping
    public List<Delivery> getAllByName(@RequestParam("name") String name) {
        return deliveryService.getAllByName(name);
    }

    @GetMapping(value = "/{id}")
    public Delivery getById(@PathVariable("id") Long id) {
        return deliveryService.getById(id);
    }

    @GetMapping("/bill/{deliveryId}")
    public RecipientAndPrice getBill(@PathVariable Long deliveryId) {
        return deliveryService.getBill(deliveryId);
    }
}
