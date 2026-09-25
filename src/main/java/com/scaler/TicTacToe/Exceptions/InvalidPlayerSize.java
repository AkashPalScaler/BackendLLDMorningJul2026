package com.scaler.TicTacToe.Exceptions;

public class InvalidPlayerSize extends IllegalArgumentException {
    public InvalidPlayerSize(String message) {
        super(message);
    }
}
