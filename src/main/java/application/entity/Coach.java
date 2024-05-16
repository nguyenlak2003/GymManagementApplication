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
class Coach extends Person{
    private double salary;

    public Coach(double salary, String name, String gender, String address, String phoneNumber, String dob) {
        super(name, gender, address, phoneNumber, dob);
        this.salary = salary;
    }

    public Coach() {
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
}
