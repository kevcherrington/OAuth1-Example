package com.hostilesquirrel.controller;

import com.hostilesquirrel.service.OAuthExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OAuthExampleController {

    @Autowired
    private OAuthExampleService service;

    @RequestMapping(value="/", produces=MediaType.APPLICATION_JSON_UTF8_VALUE, method=RequestMethod.GET)
    public String index() {
        String retVal = service.getEcommResponse();
        return retVal;
    }
}
