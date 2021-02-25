/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apache.PulseTest.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
/**
 *
 * @author Ferry Tsolanku
 */
@Entity
@Table(name = "employee_type")
public class EmployeeType {

	private long id;
	private String employee_type_name;
	private Date employee_type_date;
	private Date system_date;

	public EmployeeType() {
	}

	public EmployeeType(String employee_type_name, Date employee_type_date, Date system_date) {
		this.employee_type_name = employee_type_name;
		this.employee_type_date = employee_type_date;
		this.system_date = system_date;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_type_no", nullable = false)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "employee_type_name", nullable = false)
	public String getEmployee_type_name() {
		return employee_type_name;
	}

	public void setEmployee_type_name(String employee_type_name) {
		this.employee_type_name = employee_type_name;
	}

	@Column(name = "employee_type_date", nullable = false)
	public Date getEmployee_type_date() {
		return employee_type_date;
	}

	public void setEmployee_type_date(Date employee_type_date) {
		this.employee_type_date = employee_type_date;
	}

	@Column(name = "system_date", nullable = false)
	public Date getSystem_date() {
		return system_date;
	}

	public void setSystem_date(Date system_date) {
		this.system_date = system_date;
	}

	@Override
	public String toString() {
		return "EmployeeType [employee_type_no=" + id + ", employee_type_name" + employee_type_name + ", employee_type_date=" + employee_type_date
				+ ", system_date=" + system_date + "]";
	}

}