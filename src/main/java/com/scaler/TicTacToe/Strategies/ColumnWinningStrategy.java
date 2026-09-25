package com.scaler.TicTacToe.Strategies;

import com.scaler.TicTacToe.Models.Board;
import com.scaler.TicTacToe.Models.Cell;
import com.scaler.TicTacToe.Models.Move;

import java.util.HashMap;
import java.util.Map;

public class ColumnWinningStrategy implements WinningStrategy {
    HashMap<Integer, Map<Character, Integer>> colCountMap = new HashMap<>();
    @Override
    public void undo(Board board, Move move) {
        //Update
        Cell cell = move.getCell();
        Integer col = cell.getColumn();

        Character symbol = move.getPlayer().getSymbol().getSymChar();

        colCountMap.putIfAbsent(col, new HashMap<>());
        Map<Character, Integer> countMap = colCountMap.get(col);

        countMap.putIfAbsent(symbol, 0);
        countMap.put(symbol, countMap.get(symbol) - 1);
    }
    @Override
    public boolean checkWinner(Board board, Move move) {
        //Update
        Cell cell = move.getCell();
        Integer col = cell.getColumn();

        Character symbol = move.getPlayer().getSymbol().getSymChar();

        colCountMap.putIfAbsent(col, new HashMap<>());
        Map<Character, Integer> countMap = colCountMap.get(col);

        countMap.putIfAbsent(symbol, 0);
        countMap.put(symbol, countMap.get(symbol) + 1);

        //Check
        if(countMap.get(symbol) == board.getDimension()){
            return true;
        }
        return false;
    }
}
