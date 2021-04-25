/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apache.PulseTest.Repository;

import com.apache.PulseTest.Models.FinancialOperation;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Ferry
 */
public interface FinanceOperationalRepository extends JpaRepository<FinancialOperation, Long>{
    
}
