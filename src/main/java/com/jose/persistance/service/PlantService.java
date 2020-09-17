package com.jose.persistance.service;

import com.jose.persistance.data.Plant;
import org.springframework.stereotype.Service;

@Service
public class PlantService {

    public Plant getPlantByName(String name){
        return new Plant();
    }

}

