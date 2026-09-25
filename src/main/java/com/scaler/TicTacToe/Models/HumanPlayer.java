package com.scaler.TicTacToe.Models;

import com.scaler.TicTacToe.Validations.ValidateMove;

import java.util.Scanner;

public class HumanPlayer extends Player {
    private String email;
    private Scanner sc = new Scanner(System.in);

    public HumanPlayer(String name, Symbol symbol, String email) {
        super(name, symbol);
        this.email = email;
    }

    @Override
    public Move makeMove(Board board) {
        System.out.println("It's " + this.getName() + "'s move! Please enter your move to play.");
        System.out.println("Please enter the row:");
        Integer row = sc.nextInt();
        System.out.println("Please enter the column:");
        Integer col = sc.nextInt();

        Move move = new Move(this, new Cell(row, col));
        // validateMove
        ValidateMove.validate(board, move);
        return move;
    }
}
