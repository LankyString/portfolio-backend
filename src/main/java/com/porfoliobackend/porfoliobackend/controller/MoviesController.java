package com.porfoliobackend.porfoliobackend.controller;


import com.porfoliobackend.porfoliobackend.model.Movie;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MoviesController {

    @RequestMapping(value = "/movie", method = RequestMethod.GET)
    public Movie getMovie(){

        RestTemplate template = new RestTemplate();
        Movie movieTitle = template.getForObject("https://swapi.dev/api/films/1/", Movie.class);


    return movieTitle;

    }


}
