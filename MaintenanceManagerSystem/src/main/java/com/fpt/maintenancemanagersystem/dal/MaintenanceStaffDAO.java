package com.fpt.maintenancemanagersystem.dal;

import com.fpt.maintenancemanagersystem.model.MaintenanceStaff;

import java.io.Serializable;
import java.sql.SQLException;

public class MaintenanceStaffDAO implements Serializable {
    public  MaintenanceStaff login(String email,String password){
        if (email.matches("staff1@gmail.com") && password.matches("12345")){
            return new MaintenanceStaff(email,password);
        }
        return null;
    }
}
