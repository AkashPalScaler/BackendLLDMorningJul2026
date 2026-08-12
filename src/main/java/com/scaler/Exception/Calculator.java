package com.scaler.Exception;

import java.io.IOException;
import java.sql.SQLException;

public class Calculator {
    public float divide(int a, int b) throws SQLException, IOException {

                if (b == 0) {
                    throw new ArithmeticException();
                }
                if (a == 0) {
                    throw new SQLException();
                }
                if (a == 5) {
                    throw new IOException();
                }
            return a / b;
    }
}
// SDE 1 -> SDE 2 -> SDE 3 -> STAFF -> CTO -> CEO -> Public reputational loss
// Check exceptions when they are thrown to caller function