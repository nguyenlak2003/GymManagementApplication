/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.entity;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Le Van Phong Tu
 */
@XmlRootElement(name = "gymermembers")
@XmlAccessorType(XmlAccessType.FIELD)
public class GymerMember extends Person implements Serializable{
    private String id;
    private String startDay, endDay;
    private String coach;

    public GymerMember(String id, String name, String gender, String address, String phoneNumber, String dob, String startDay, String endDay, String coach) {
        super(name, gender, address, phoneNumber, dob);
        this.id = id;
        this.startDay = startDay;
        this.endDay = endDay;
        this.coach = coach;
    }

    public GymerMember() {
    }

    public String getid() {
        return id;
    }

    public void setid(String maGymer) {
        this.id = id;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }
    
}
    
    
    

    
