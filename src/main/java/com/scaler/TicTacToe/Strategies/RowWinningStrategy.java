package com.scaler.TicTacToe.Strategies;

import com.scaler.TicTacToe.Models.Board;
import com.scaler.TicTacToe.Models.Cell;
import com.scaler.TicTacToe.Models.Move;

import java.util.HashMap;
import java.util.Map;

// For each row - we will have a count map
// 0 - {symbol_character : int_count},
// 1-{symbol_character : int_count},
// 2-{symbol_character : int_count}
public class RowWinningStrategy implements WinningStrategy {
    @Override
    public void undo(Board board, Move move) {
        //Update
        Cell cell = move.getCell();
        Integer row = cell.getRow();

        Character symbol = move.getPlayer().getSymbol().getSymChar();

        rowCountMap.putIfAbsent(row, new HashMap<>());
        Map<Character, Integer> countMap = rowCountMap.get(row);

        countMap.putIfAbsent(symbol, 0);
        countMap.put(symbol, countMap.get(symbol) - 1);
    }

    HashMap<Integer, Map<Character, Integer>> rowCountMap = new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move move) {
        //Update
        Cell cell = move.getCell();
        Integer row = cell.getRow();

        Character symbol = move.getPlayer().getSymbol().getSymChar();

        rowCountMap.putIfAbsent(row, new HashMap<>());
        Map<Character, Integer> countMap = rowCountMap.get(row);

        countMap.putIfAbsent(symbol, 0);
        countMap.put(symbol, countMap.get(symbol) + 1);

        //Check
        if(countMap.get(symbol) == board.getDimension()){
            return true;
        }
        return false;
    }
}
