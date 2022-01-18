package com.porfoliobackend.porfoliobackend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@RestController
public class CovidController {

    @RequestMapping(value = "/covid", method = RequestMethod.GET, produces = "application/json; charset=utf-8;")
    public String printCovidInfo(){

        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl
                = "https://ws.cso.ie/public/api.restful/PxStat.Data.Cube_API.ReadDataset/MUM02/JSON-stat/1.0/en";

        ResponseEntity response = restTemplate.getForEntity(fooResourceUrl, String.class);
        String responseString = response.toString();
        //JsonNode

        return responseString;


















//        //YourBean obj = restTemplate.setUriTemplateHandler("https://ws.cso.ie/public/api.restful/PxStat.Data.Cube_API.ReadDataset/MUM02/JSON-stat/1.0/en");
//        Date date = new Date();
//
//        //return date.toString();
//        return fooResourceUrl;

    }


}
