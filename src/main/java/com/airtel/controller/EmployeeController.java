package com.airtel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {


    @PostMapping("/addEmployees")
    public String addEmployee()
    {
        //return response;
        return null;
    }

    @GetMapping("/getEmployees")
    public String getEmployee()
    {
        //return response;
        return null;
    }

}
