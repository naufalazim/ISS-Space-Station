package com.Tracker.Satellite.controller;

import com.Tracker.Satellite.model.IssLocater;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class ISSController {

    @GetMapping("/location")
    public IssLocater getLocation() {

        //URL: http://api.open-notify.org/iss-now.json using RestTemplate
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://api.open-notify.org/iss-now.json", IssLocater.class);

    }
}
