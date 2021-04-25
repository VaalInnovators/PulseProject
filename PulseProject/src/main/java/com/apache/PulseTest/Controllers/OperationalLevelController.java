/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apache.PulseTest.Controllers;

import com.apache.PulseTest.Models.FinancialOperation;
import com.apache.PulseTest.Repository.FinanceOperationalRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Mokete
 */
@RestController
public class OperationalLevelController {
    @Autowired
    FinanceOperationalRepository financeOperationalRepository;

    @GetMapping("/allFinancialOperation")
    public List<FinancialOperation> getAllFinanceStructure()
    {
        String error ="";
        List<FinancialOperation> listFinancialOperation = new ArrayList<FinancialOperation>();
        try
        {
            listFinancialOperation = financeOperationalRepository.findAll();
        }
        catch(Exception ex)
        {
            error = ex.getMessage().toString();
        }

        //if(ListFinanceStructure.size() > 0) {
        return listFinancialOperation;
        //} else {
        //    return new ArrayList<Finance_STRUCTURE>();
        //}
    }
    @RequestMapping("/addFinancialOperation")
    @CrossOrigin(origins="http://localhost:4200")
    public FinancialOperation AddFinanceStructure(@RequestBody FinancialOperation FinanceStructure)
    {
        String error = "";
        try
        {
            financeOperationalRepository.save(FinanceStructure);
        }
        catch(Exception ex)
        {
            error = ex.getMessage().toString();
        }

        return FinanceStructure;
    }
}
