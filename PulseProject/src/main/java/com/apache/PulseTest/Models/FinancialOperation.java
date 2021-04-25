/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apache.PulseTest.Models;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 *
 * @author Ferry
 */
@Entity
@Data
@Table(name="FINANCIAL_OPERATION")
public class FinancialOperation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String financial_operation_description;

    @Column
    private String financial_operation_financed;

    @Column
    private String financial_operation_responsible_official;

    @Column
    private String financial_operation_comments;

    @Column
    private String financial_operation_action_who;

    @Column
    private String financial_operation_action_when;

    @Column
    private String financial_operation_action_output;

    @Column
    private String financial_operation_date;
}
