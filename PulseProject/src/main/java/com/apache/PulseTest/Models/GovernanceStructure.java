/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apache.PulseTest.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import org.springframework.data.annotation.Id;

/**
 *
 * @author Ferry Tsolanku
 */
@Entity
@Table(name="Governance_Structure")
public class GovernanceStructure {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @javax.persistence.Id
    
    
    private int id;
    private String GovernanceStructure_Name;
    private String GovernanceStructure_Avaible;
    private String GovernanceStructure_FullyFunctional;
    private String GovernanceStructure_ResponsiblePerson;
    private String GovernanceStructure_Comments;
    private String GovernanceStructureAction_Who;
    private String GovernanceStructureAction_When;
    private String GovernanceStructureAction_Output;
    private String GovernanceStructure_Date;
    
    public int getID()
    {
        return id;
    }
    
    public void setID(int id)
    {
        this.id = id;
    }
    
    public String getGovernanceStructure_Name()
    {
        return GovernanceStructure_Name;
    }
    
    public void setGovernanceStructure_Name(String _GovernanceStructure_Avaible)
    {
        this.GovernanceStructure_Name = _GovernanceStructure_Avaible;
    }
    
    public String getGovernanceStructure_Avaible()
    {
        return GovernanceStructure_Avaible;
    }
    
    public void setGovernanceStructure_Avaible(String _GovernanceStructure_Avaible)
    {
        this.GovernanceStructure_Avaible = _GovernanceStructure_Avaible;
    }
    
    public String getGovernanceStructure_FullyFunctional()
    {
        return GovernanceStructure_FullyFunctional;
    }
    
    public void setGovernanceStructure_FullyFunctional(String _GovernanceStructure_FullyFunctional)
    {
        this.GovernanceStructure_FullyFunctional = _GovernanceStructure_FullyFunctional;
    }
    
    public String getGovernanceStructure_ResponsiblePerson()
    {
        return GovernanceStructure_ResponsiblePerson;
    }
    
    public void setGovernanceStructure_ResponsiblePerson(String _GovernanceStructure_ResponsiblePerson)
    {
        this.GovernanceStructure_ResponsiblePerson = _GovernanceStructure_ResponsiblePerson;
    }
    
     public String getGovernanceStructure_Comments()
    {
        return GovernanceStructure_Comments;
    }
    
    public void setGovernanceStructure_Comments(String _GovernanceStructure_Comments)
    {
        this.GovernanceStructure_Comments = _GovernanceStructure_Comments;
    }
    
    public String getGovernanceStructureAction_Who()
    {
        return GovernanceStructureAction_Who;
    }
    
    public void setGovernanceStructureAction_Who(String _GovernanceStructureAction_Who)
    {
        this.GovernanceStructureAction_Who = _GovernanceStructureAction_Who;
    }
    
    public String getGovernanceStructureAction_When()
    {
        return GovernanceStructureAction_When;
    }
    
    public void setGovernanceStructureAction_When(String _GovernanceStructureAction_When)
    {
        this.GovernanceStructureAction_When = _GovernanceStructureAction_When;
    }
    
    public String getGovernanceStructureAction_Output()
    {
        return GovernanceStructureAction_Output;
    }
    
    public void setGovernanceStructureAction_Output(String _GovernanceStructureAction_Output)
    {
        this.GovernanceStructureAction_Output = _GovernanceStructureAction_Output;
    }
    
    public String getGovernanceStructure_Date()
    {
        return GovernanceStructure_Date;
    }
    
    public void setGovernanceStructure_Date(String _GovernanceStructure_Date)
    {
        this.GovernanceStructure_Date = _GovernanceStructure_Date;
    }
}
