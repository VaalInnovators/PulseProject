/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apache.PulseTest.Models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import org.springframework.data.annotation.Id;
/**
 *
 * @author Ferry Tsolanku
 */
@Entity
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @javax.persistence.Id
    
    private int LoginId;
    private String Username;
    private String Password;
    private String CreatedDate;
    
    public Login()
    {
        
    }
    
    public Login(String pUsername, String pPassword,String pCreatedDate)
    {
        this.Username = pUsername;
        this.Password = pPassword;
        this.CreatedDate = pCreatedDate;
    }
    
    public int getProdID()
    {
        return LoginId;
    }
    
    public void setProID(int id)
    {
        this.LoginId = id;
    }
    
    public String getUsername()
    {
        return Username;
    }
    
    public void setUsername(String usrName)
    {
        this.Username = usrName;
    }
    
    public String getPassword()
    {
        return Password;
    }
    
    public void setPassword(String pass)
    {
        this.Password = pass;
    }
    
    public String getCreatedDate()
    {
        return CreatedDate;
    }
    
    public void setCreatedDate(String createdDate)
    {
        this.CreatedDate = createdDate;
    }
}

