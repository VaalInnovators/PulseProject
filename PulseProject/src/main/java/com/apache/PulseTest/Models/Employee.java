package com.apache.PulseTest.Models;

import java.util.Date;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    @javax.persistence.Id
    
    private int id;
    private String Employee_Name;
    private String Employee_Surname;
    private int Employee_Type_No;
    private String Email_Address;
    private String Password;
    private Date Employee_Date;
    private Date System_Date;
    private String Phone_Number;
    private String Street_Address;
    private String Street_Name;
    private String Suburb;
    private String City;
    private int ZIp_Code;
    private int Entity_No;

  
    public Employee() {
	}

	public Employee(String employee_Name,String employee_Surname, int employee_Type_No,String email_address, 
                String password_no,Date Employee_Date, Date System_Date, String phone_number, String Street_Address,
                String Street_Name, String Suburb, String city, int zip_code, int entity_no) {
		this.Employee_Name = employee_Name;
		this.Employee_Surname = employee_Surname;
		this.Employee_Type_No = employee_Type_No;
                this.Email_Address = email_address;
                this.Password = password_no;
                this.Employee_Date = Employee_Date;
                this.System_Date = System_Date;
                this.Phone_Number = phone_number;
                this.Street_Address = Street_Address;
                this.Street_Name = Street_Name;
                this.Suburb = Suburb;
                this.City = city;
                this.ZIp_Code = zip_code;
                this.Entity_No = entity_no;
	}
    
    public int getEmpID()
    {
        return id;
    }
    
    public void setEmpID(int id)
    {
        this.id = id;
    }
    
    public String getEmpName()
    {
        return Employee_Name;
    }
    
    public void setEmpName(String name)
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
    
     public int getEmpTypeNo()
    {
        return Employee_Type_No;
    }
    
    public void setEmpTypeNo(int empTypeNo)
    {
        this.Employee_Type_No = empTypeNo;
    }
    
    public String getEmailAddress()
    {
        return Email_Address;
    }
    
    public void setEmailAddress(String email_address)
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
    
    public Date getEmpDate()
    {
        return Employee_Date;
    }
    
    public void setEmpDate(Date empDate)
    {
        this.Employee_Date = empDate;
    }
    
     public Date getSysDate()
    {
        return System_Date;
    }
    
    public void setSysDate(Date systDate)
    {
        this.System_Date = systDate;
    }
    
    public String getPhoneNo()
    {
        return Phone_Number;
    }
    
    public void setPhoneNo(String PhoneNo)
    {
        this.Phone_Number = PhoneNo;
    }
    
    public String getStreetAddress()
    {
        return Street_Address;
    }
    
    public void setStreetAddress(String Adress)
    {
        this.Street_Address = Adress;
    }
    
    public String getStreetName()
    {
        return Street_Name;
    }
    
    public void setStreetName(String streetName)
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
    
    public int getZipCode()
    {
        return ZIp_Code;
    }
    
    public void setZipCode(int zip)
    {
        this.ZIp_Code = zip;
    }
    
    public int getEntityNo()
    {
        return Entity_No;
    }
    
    public void setEntityNo(int entityNo)
    {
        this.Entity_No = entityNo;
    }
}
