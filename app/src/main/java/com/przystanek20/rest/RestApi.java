package com.przystanek20.rest;

import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.client.RestTemplate;


/**
 * Created by Adam on 2017-06-09.
 */
public abstract class RestApi<T> {

    private final String APPLICATION_URL = "https://przystanek2-0.herokuapp.com/";

    protected T get(String endpointUrl, Class clazz) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new GsonHttpMessageConverter());
        return (T) restTemplate.getForObject(APPLICATION_URL + endpointUrl, clazz);
    }

    protected String post(String endpointUrl, Class clazz, T body) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new GsonHttpMessageConverter());
        restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
        return (String) restTemplate.postForObject(APPLICATION_URL + endpointUrl, body, clazz);
    }

    protected String generateEndpointUrl(String endpointPattern, String... values) {
        for(String value : values) {
            endpointPattern = endpointPattern.replaceFirst("{}", value);
        }

        return endpointPattern;
    }
}