package com.porfoliobackend.porfoliobackend.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.porfoliobackend.porfoliobackend.model.EmployeeVO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeRESTController {

    @GetMapping(value = "/employees")
    public String getAllEmployees() throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();
        List employees = new ArrayList<>();

        EmployeeVO empOne = new EmployeeVO(1,"Lokesh","Gupta","lgupta@gmail.com");
        EmployeeVO empTwo = new EmployeeVO(2,"Amit","Singhal","asinghal@gmail.com");
        EmployeeVO empThree = new EmployeeVO(3,"Kirti","Mishra","kmishra@gmail.com");

        employees.add(empOne);
        employees.add(empThree);
        employees.add(empTwo);

        return objectMapper.writeValueAsString(employees.toString());
    }

    @GetMapping(value = "/employees/{id}")
    public ResponseEntity<EmployeeVO> getEmployeeById (@PathVariable("id") int id){
        if(id<=3){
            EmployeeVO employee = new EmployeeVO(1,"Lokesh","Gupta","lgupta@gmail.com");
            return new ResponseEntity<EmployeeVO>(employee, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }



}
