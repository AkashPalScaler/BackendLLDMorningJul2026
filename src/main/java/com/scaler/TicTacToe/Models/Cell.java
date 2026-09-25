package com.scaler.TicTacToe.Models;

public class Cell {
    private  int row;
    private int column;
    private CellState state;
    private Symbol symbol;
    public Cell(int row, int column) {
        this.row = row;
        this.column = column;
        this.state = CellState.EMPTY;
    }

    public void display(){
        if(this.state == CellState.EMPTY){
            System.out.print("| |");
        }else{
            System.out.print("|" + this.symbol.getSymChar() + "|");
        }
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public CellState getState() {
        return state;
    }

    public void setState(CellState state) {
        this.state = state;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }
}
