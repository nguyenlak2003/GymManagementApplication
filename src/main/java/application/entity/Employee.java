/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.entity;

import java.util.Date;

/**
 *
 * @author Le Van Phong Tu
 */
public class Employee extends Person{
    private double salary;
    private String startDay, endDay, breakDay;

    public Employee(double salary, String startDay, String endDay, String breakDay, String name, String gender, String address, String phoneNumber, String dob) {
        super(name, gender, address, phoneNumber, dob);
        this.salary = salary;
        this.startDay = startDay;
        this.endDay = endDay;
        this.breakDay = breakDay;
    }

    public Employee() {
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
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

    public String getBreakDay() {
        return breakDay;
    }

    public void setBreakDay(String breakDay) {
        this.breakDay = breakDay;
    }
    
}
