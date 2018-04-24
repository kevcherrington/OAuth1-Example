package com.hostilesquirrel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OAuthExampleService {

    @Autowired
    private OAuthRestTemplate restTemplate;

    public String getEcommResponse() {
        return "";
    }
}
