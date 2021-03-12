/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apache.PulseTest.Services;

import com.apache.PulseTest.Models.Employee;
import com.apache.PulseTest.Models.Login;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ferry Tsolanku
 */
@Service
public class LoginService {
    
    @Autowired
    DataSource datasource;
    
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    public void EmpCreate(Employee employee)
    {
        String sql = "INSERT INTO Employee VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        //jdbcTemplate.update(sql, new Object[] {employee.getEmpName(), employee.getEmpSurname(),employee.getEmpTypeNo(), employee.getEmailAddress(), employee.getPassword(), 
        //employee.getEmpDate(), employee.getSysDate(), employee.getPhoneNo(),employee.getStreetAddress(), employee.getStreetName(), employee.getSuburb(),employee.getCity(), employee.getZipCode(), employee.getEntityNo()});
    }
    
    public Employee ValidateLogin(Login login)
    {
        String sql = "SELECT * FROM Login WHERE Username '"+ login.getUsername()+"' and Password '"+ login.getPassword()+"' ";
        
        List<Employee> employee = jdbcTemplate.query(sql, new UserMapper());
        
        return employee.size() > 0 ? employee.get(0) : null;
    }
    
    class UserMapper implements RowMapper<Employee> {

  public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
    Employee employee = new Employee();

    /**user.setUsername(rs.getString("username"));
    user.setPassword(rs.getString("password"));
    user.setFirstname(rs.getString("firstname"));
    user.setLastname(rs.getString("lastname"));
    user.setEmail(rs.getString("email"));
    user.setAddress(rs.getString("address"));
    user.setPhone(rs.getInt("phone"));**/
    //employee.setEmpName(rs.getString("Employee_Name"));
    //employee.setEmpSurname(rs.getString("Employee_Surname"));
    //employee.setEmpTypeNo(rs.getInt("Employee_Type_No"));
    //employee.setEmailAddress(rs.getString("Email_Address"));
    //employee.setPassword(rs.getString("Password"));
    //employee.setEmpDate(rs.getString("Employee_Date"));
    //employee.setSysDate(rs.getString("System_Date"));
    //employee.setPhoneNo(rs.getString("Phone_Number"));
    //employee.setStreetAddress(rs.getString("Street_Address"));
    //employee.setStreetName(rs.getString("Street_Name"));
    //employee.setSuburb(rs.getString("Suburb"));
    //employee.setCity(rs.getString("City"));
    //employee.setZipCode(rs.getInt("ZIp_Code"));
    //employee.setEntityNo(rs.getInt("Entity_No"));

    return employee;
        }
    }
}
