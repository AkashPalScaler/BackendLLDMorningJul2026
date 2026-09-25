package com.scaler.TicTacToe.Models;

public abstract class Player {
    private String name;
    private Symbol symbol;
    public Player(String name, Symbol symbol) {
        this.name = name;
        this.symbol = symbol;
    }
    public abstract Move makeMove(Board board); // Force anybody who wants to become a player to override/define the makemove

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }
}
