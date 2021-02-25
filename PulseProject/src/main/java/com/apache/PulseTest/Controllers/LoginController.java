/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apache.PulseTest.Controllers;

import com.apache.PulseTest.Models.Employee;
import com.apache.PulseTest.Repository.EmployeeRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ferry Tsolanku
 */
@RestController
public class LoginController {
    
   @Autowired
  EmployeeRepository repo;
    
  @RequestMapping("/LoginValidate/{id}")
    public Optional<Employee> ValidateLogin(@PathVariable("id")int id) {
        // emp = LoginServ.ValidateLogin(login);
 
        //return emp;
        return repo.findById(id);
    }
    
    @PostMapping(path="/createEmployee",consumes= {"application/json"})
    public Employee CreateEmployee(@RequestBody Employee employee)
    {
        repo.save(employee);
       return employee;
    }
    
}