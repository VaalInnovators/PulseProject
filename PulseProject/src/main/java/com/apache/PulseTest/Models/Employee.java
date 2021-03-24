package com.apache.PulseTest.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import org.springframework.data.annotation.Id;

/**
 *
 * @author Ferry Tsolanku
 */
@Entity
public class Employee {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @javax.persistence.Id
    
    private int id;
    private String Employee_Name;
    private String Employee_Surname;
    private int Employee_Type_No;
    private String Email_Address;
    private String Password;
    private String Employee_Date;
    private String System_Date;
    private String Phone_Number;
    private String Street_Address;
    private String Street_Name;
    private String Suburb;
    private String City;
    private int ZIp_Code;
    private int Entity_No;

    
    public int getID()
    {
        return id;
    }
    
    public void setID(int id)
    {
        this.id = id;
    }
    
    public String getEmployee_Name()
    {
        return Employee_Name;
    }
    
    public void setEmployee_Name(String name)
    {
        this.Employee_Name = name;
    }
        public String getEmpSurname()
    {
        return Employee_Surname;
    }
    
    public void setEmpSurname(String Surname)
    {
        this.Employee_Surname = Surname;
    }
    
     public int getEmployee_Type_No()
    {
        return Employee_Type_No;
    }
    
    public void setEmployee_Type_No(int empTypeNo)
    {
        this.Employee_Type_No = empTypeNo;
    }
    
    public String getEmail_Address()
    {
        return Email_Address;
    }
    
    public void setEmail_Address(String email_address)
    {
        this.Email_Address = email_address;
    }
    
    public String getPassword()
    {
        return Password;
    }
    
    public void setPassword(String password)
    {
        this.Password = password;
    }
    
    public String getEmployee_Date()
    {
        return Employee_Date;
    }
    
    public void setEmployee_Date(String empDate)
    {
        this.Employee_Date = empDate;
    }
    
     public String getSystem_Date()
    {
        return System_Date;
    }
    
    public void setSystem_Date(String systDate)
    {
        this.System_Date = systDate;
    }
    
    public String getPhone_Number()
    {
        return Phone_Number;
    }
    
    public void setPhone_Number(String PhoneNo)
    {
        this.Phone_Number = PhoneNo;
    }
    
    public String getStreet_Address()
    {
        return Street_Address;
    }
    
    public void setStreet_Address(String Adress)
    {
        this.Street_Address = Adress;
    }
    
    public String getStreet_Name()
    {
        return Street_Name;
    }
    
    public void setStreet_Name(String streetName)
    {
        this.Street_Name = streetName;
    }
    
    public String getSuburb()
    {
        return Suburb;
    }
    
    public void setSuburb(String Suburb)
    {
        this.Suburb = Suburb;
    }
    
    public String getCity()
    {
        return City;
    }
    
    public void setCity(String city)
    {
        this.City = city;
    }
    
    public int getZIp_Code()
    {
        return ZIp_Code;
    }
    
    public void setZIp_Code(int zip)
    {
        this.ZIp_Code = zip;
    }
    
    public int getEntity_No()
    {
        return Entity_No;
    }
    
    public void setEntity_No(int entityNo)
    {
        this.Entity_No = entityNo;
    }
}
