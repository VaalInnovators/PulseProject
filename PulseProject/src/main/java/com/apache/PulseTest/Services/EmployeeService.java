/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apache.PulseTest.Services;

import com.apache.PulseTest.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.apache.PulseTest.Models.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ferry Tsolanku
 */
@Service
public class EmployeeService {
    
    @Autowired
    EmployeeRepository repository;
     
    public List<Employee> getAllEmployees()
    {
        List<Employee> employeeList = repository.findAll();
         
        if(employeeList.size() > 0) {
            return employeeList;
        } else {
            return new ArrayList<Employee>();
        }
    }
}
