package com.test.client;

import org.springframework.web.client.RestTemplate;

public class TestMovieControllerClient {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject("http://localhost:8080/rest-service/hello", String.class);
        System.out.println("Response ===> "+response);
    }
}
