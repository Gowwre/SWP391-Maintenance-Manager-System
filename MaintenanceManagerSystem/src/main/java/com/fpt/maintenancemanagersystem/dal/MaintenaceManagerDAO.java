package com.fpt.maintenancemanagersystem.dal;

import com.fpt.maintenancemanagersystem.model.MaintenanceManager;

public class MaintenaceManagerDAO {
    public MaintenanceManager login(String email,String password){
        if (email.matches("manager@gmail.com")&&password.matches("111")){
            return new MaintenanceManager(email,password);
        }
        return null;
    }
}
