package com.fpt.maintenancemanagersystem.dal;

import com.fpt.maintenancemanagersystem.dbcontext.DBContext;
import com.fpt.maintenancemanagersystem.model.MaintenanceStaff;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MaintenanceStaffDAO implements Serializable {
    public MaintenanceStaff login(String email, String password) throws SQLException, ClassNotFoundException {
        String SQL = "Select * From [Staff] where [email]=? and [password]=?";

        Connection connection = DBContext.makeConnection();

        PreparedStatement statement = connection.prepareStatement(SQL);
        statement.setString(1, email);
        statement.setString(2, password);

        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            return new MaintenanceStaff(resultSet.getString("email"), resultSet.getString("password"));
        }
        return null;
    }
}
