package com.fhc.principios.srp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class EmployeeRepository {
    public void save(Employee employee) {
        Connection connection = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDB", "root", "password");
            stmt = connection.createStatement();
            stmt.execute("INSERT INTO EMPLOYEE VALUES (" + employee.getEmployeeId() + ", " + employee.getEmployeeName() +", " + employee.getEmployeeAddress() +", " + employee.getEmployeeNumber() +", " + employee.getEmployeeType() +")");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
