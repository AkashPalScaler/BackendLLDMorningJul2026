package com.scaler.TicTacToe.Factories;

import com.scaler.TicTacToe.Models.WinningStrategyType;
import com.scaler.TicTacToe.Strategies.ColumnWinningStrategy;
import com.scaler.TicTacToe.Strategies.RowWinningStrategy;
import com.scaler.TicTacToe.Strategies.WinningStrategy;

public class WinningStrategyFactory {
    public static WinningStrategy getWinningStrategy(WinningStrategyType type) {
        // Need to add here the conditions to return correct winning
        // strategy object once winning strategy concrete classes are ready
        if(type == WinningStrategyType.ROW) {
            return new RowWinningStrategy();
        }else if(type == WinningStrategyType.COLUMN) {
            return new ColumnWinningStrategy();
        }else {
            throw new  IllegalArgumentException("Unknown WinningStrategyType");
        }
    }
}
// HW : TO add Diagonal and corner strategies