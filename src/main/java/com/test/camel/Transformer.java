package com.test.camel;

import org.springframework.web.client.RestTemplate;

public class Transformer {
    public String transformContent(String body) {
        System.out.println("Entering transformContent method ===> ");
        String upperCaseContent = body.toUpperCase();
        return upperCaseContent;
       /* RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject("http://localhost:8080/rest-service/hello", String.class);
        System.out.println("Response ===> "+response);
        return  response;*/
    }
}
