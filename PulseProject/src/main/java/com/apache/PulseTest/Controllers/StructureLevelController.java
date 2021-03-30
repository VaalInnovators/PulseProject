/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apache.PulseTest.Controllers;

import com.apache.PulseTest.Models.Employee;
import com.apache.PulseTest.Models.GovernanceStructure;
import com.apache.PulseTest.Repository.GovernanceStructureRepository;
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
 * @author Ferry Tsolanku
 */
@RestController
public class StructureLevelController {
    
    @Autowired
    GovernanceStructureRepository GovernanceStructureRepo;
    
    @GetMapping("/allGovernanceStructure")
    public List<GovernanceStructure> getAllGovernanceStructure()
    {
        String error ="";
        List<GovernanceStructure> ListGovernanceStructure = new ArrayList<GovernanceStructure>();
        try
        {
             ListGovernanceStructure = GovernanceStructureRepo.findAll();
        }
        catch(Exception ex)
        {
            error = ex.getMessage().toString();
        }
        
        //if(ListGovernanceStructure.size() > 0) {
            return ListGovernanceStructure;
        //} else {
        //    return new ArrayList<GOVERNANCE_STRUCTURE>();
        //}
    }
    @RequestMapping("/addGovernanceStructure")
    @CrossOrigin(origins="http://localhost:4200")
    public GovernanceStructure AddGovernanceStructure(@RequestBody GovernanceStructure governanceStructure)
    {
        String error = "";
        try
        {
            GovernanceStructureRepo.save(governanceStructure);
        }
        catch(Exception ex)
        {
            error = ex.getMessage().toString();
        }
        
       return governanceStructure;
    }
}
