/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpt.maintenancemanagersystem.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Radriar
 */
public class MaintenanceStaff implements Serializable {
    private int staffID;
    private int managerID;
    private String name;
    private LocalDate dateOfBirth;
    private String specialization;
    private String email;
    private String phoneNumber;
    private String password;
    private LocalDate beginWorkDate;
    private boolean status;
    private boolean available;

    public MaintenanceStaff() {
    }

    public MaintenanceStaff(String email, String password) {
    }

    public int getStaffID() {
        return staffID;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }

    public int getManagerID() {
        return managerID;
    }

    public void setManagerID(int managerID) {
        this.managerID = managerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getBeginWorkDate() {
        return beginWorkDate;
    }

    public void setBeginWorkDate(LocalDate beginWorkDate) {
        this.beginWorkDate = beginWorkDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "MaintenanceStaff{" +
                "staffID=" + staffID +
                ", managerID=" + managerID +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", specialization='" + specialization + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", password='" + password + '\'' +
                ", beginWorkDate=" + beginWorkDate +
                ", status=" + status +
                ", available=" + available +
                '}';
    }
}
