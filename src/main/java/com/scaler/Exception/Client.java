package com.scaler.Exception;

import java.sql.SQLException;

public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        float val = 0;
        try {
            val = calculator.divide(0, 1);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(val);
    }
}
