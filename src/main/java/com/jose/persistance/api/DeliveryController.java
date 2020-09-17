package com.jose.persistance.api;

import com.jose.persistance.data.Delivery;
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

    @GetMapping(value = "/{name}")
    public List<Delivery> getAllByName(@PathVariable("name") String name) {
        return deliveryService.getAllByName(name);
    }
}
