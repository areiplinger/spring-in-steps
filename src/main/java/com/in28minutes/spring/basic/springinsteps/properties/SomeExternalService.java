package com.in28minutes.spring.basic.springinsteps.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SomeExternalService {

    //From properties file
    @Value("${external.service.url}")
    private String url;

    public String returnUrl(){
        return url;
    }
}
