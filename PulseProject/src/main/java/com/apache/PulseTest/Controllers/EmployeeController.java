/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apache.PulseTest.Controllers;

import com.apache.PulseTest.Models.Employee;
import com.apache.PulseTest.Services.EmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ferry Tsolanku
 */
@RestController
//@RequestMapping("/Employees")
public class EmployeeController {
    
     @Autowired
    EmployeeService service;
 
    @GetMapping("/allEmployees")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> list = service.getAllEmployees();
 
        return new ResponseEntity<List<Employee>>(list, new HttpHeaders(), HttpStatus.OK);
    }
    
    
  

}
