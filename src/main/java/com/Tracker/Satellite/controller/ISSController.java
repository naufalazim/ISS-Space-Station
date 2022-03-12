package com.Tracker.Satellite.controller;

import com.Tracker.Satellite.model.IssLocater;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class ISSController {

    //message failed:
    private static final String FAILED = "Connection API Failed";

    @GetMapping("/location")
    public IssLocater getLocation() {
        //URL: http://api.open-notify.org/iss-now.json using RestTemplate

        try {
            RestTemplate restTemplate = new RestTemplate();
            return restTemplate.getForObject("http://api.open-notify.org/iss-now.json", IssLocater.class);
        }catch (Exception e) {
            IssLocater issLocater = new IssLocater();
            issLocater.setMessage(FAILED);
            return  issLocater;
        }

    }
}
