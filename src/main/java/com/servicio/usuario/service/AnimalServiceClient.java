package com.servicio.usuario.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.servicio.usuario.model.Animal;

@Service
public class AnimalServiceClient {
    private final RestTemplate restTemplate;
    private final String animalServiceUrl;

    public AnimalServiceClient(RestTemplate restTemplate, @Value("${animal.service.url}") String animalServiceUrl){
        this.restTemplate = restTemplate;
        this.animalServiceUrl = animalServiceUrl;
    }

    public Animal findById(String id){
        return restTemplate.getForObject(animalServiceUrl + "/" + id, Animal.class);
    }
}
