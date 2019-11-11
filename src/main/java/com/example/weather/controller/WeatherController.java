package com.example.weather.controller;

import com.example.weather.domain.Quote;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Queue;

@RestController
public class WeatherController {

    private RestTemplate restTemplate = new RestTemplate();

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public Quote getQuote(){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<Quote> entity = new HttpEntity<>(headers);

        ResponseEntity<Quote> exchange = restTemplate.exchange("https://gturnquist-quoters.cfapps.io/api/random", HttpMethod.GET, entity, Quote.class);
        return exchange.getBody();
    }

}
