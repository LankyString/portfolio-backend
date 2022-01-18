package com.porfoliobackend.porfoliobackend.controller;

import com.porfoliobackend.porfoliobackend.model.Pizza;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PizzaController {
   // return a pizza

    @RequestMapping(value = "/pepperoniPizza", method = RequestMethod.GET)
    //@GetMapping(value = "pepperoniPizza")
    public Pizza getPizza() {

        Pizza pepperoniPizza = new Pizza();
        List toppingCon = new ArrayList<String>();
        toppingCon.add("pepperoni");
        toppingCon.add("cheese");
        toppingCon.add("tomato sauce");

        pepperoniPizza.setBase("Potato");

        pepperoniPizza.setTopping(toppingCon);


        return pepperoniPizza;


    }

}
