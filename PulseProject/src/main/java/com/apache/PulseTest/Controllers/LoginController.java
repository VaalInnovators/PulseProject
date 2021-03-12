/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apache.PulseTest.Controllers;

import com.apache.PulseTest.Models.Employee;
import com.apache.PulseTest.Repository.EmployeeRepository;
import java.util.Optional;
import java.util.logging.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    
    @RequestMapping("/createEmployee")
    public Employee CreateEmployee(@RequestBody Employee employee)
    {
        String error = "";
        try
        {
            repo.save(employee);
        }
        catch(Exception ex)
        {
            error = ex.getMessage().toString();
        }
        
       return employee;
    }
    
}