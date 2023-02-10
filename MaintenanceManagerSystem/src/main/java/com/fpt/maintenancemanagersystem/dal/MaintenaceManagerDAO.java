package com.fpt.maintenancemanagersystem.dal;

import com.fpt.maintenancemanagersystem.dbcontext.DBContext;
import com.fpt.maintenancemanagersystem.model.MaintenanceManager;
import com.fpt.maintenancemanagersystem.model.MaintenanceStaff;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MaintenaceManagerDAO {
    public MaintenanceManager login(String email, String password) throws SQLException, ClassNotFoundException {
        String SQL = "Select * From [Manager] where [email]=? and [password]=?";

        Connection connection = DBContext.makeConnection();

        PreparedStatement statement = connection.prepareStatement(SQL);
        statement.setString(1, email);
        statement.setString(2, password);

        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            return new MaintenanceManager(resultSet.getString("email"), resultSet.getString("password"));
        }
        return null;
    }
}

