/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apache.PulseTest.Repository;

import com.apache.PulseTest.Models.GovernanceStructure;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Ferry Tsolanku
 */
public interface GovernanceStructureRepository extends JpaRepository<GovernanceStructure, Integer> {
    
}
