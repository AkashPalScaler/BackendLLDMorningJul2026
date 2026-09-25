package com.scaler.TicTacToe.Validations;

import com.scaler.TicTacToe.Exceptions.InvalidPlayerSize;
import com.scaler.TicTacToe.Models.Board;
import com.scaler.TicTacToe.Models.Player;

import java.util.List;

public class ValidatePlayerSize {
    public static void validate(List<Player> players, Integer dimension) {
        if(dimension >= players.size() && players.size() < 2) {
            throw new InvalidPlayerSize("Invalid player size, please check the player count");
        }
    }
}
