package com.scaler.TicTacToe.Validations;

import com.scaler.TicTacToe.Models.Board;
import com.scaler.TicTacToe.Models.Cell;
import com.scaler.TicTacToe.Models.CellState;
import com.scaler.TicTacToe.Models.Move;

public class ValidateMove {
    public static void validate(Board board, Move move) {
        Cell cell = move.getCell();
        if(cell.getRow() < 0 || cell.getRow() > board.getDimension() || cell.getColumn() < 0 || cell.getColumn() > board.getDimension()) {
            throw  new IllegalArgumentException("Invalid move: outside the board");
        }
        if(cell.getState().equals(CellState.FILLED)){
            throw new  IllegalArgumentException("Invalid move: cell already occupied");
        }
    }
}
