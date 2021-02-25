/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apache.PulseTest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.apache.PulseTest.Models.Login;

/**
 *
 * @author Ferry Tsolanku
 */
public interface LoginRepository extends JpaRepository<Login, Integer>{
    
}
