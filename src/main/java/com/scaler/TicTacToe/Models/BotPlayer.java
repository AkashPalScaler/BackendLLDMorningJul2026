package com.scaler.TicTacToe.Models;

import com.scaler.TicTacToe.Factories.BotPlayingStrategyFactory;
import com.scaler.TicTacToe.Strategies.BotPlayingStrategy;

import java.util.List;

public class BotPlayer extends Player {
    private BotDifficultyLevel difficultyLevel;
    private BotPlayingStrategy playingStrategy;


    public BotPlayer(String name, Symbol symbol, BotDifficultyLevel difficultyLevel) {
        super(name, symbol);
        this.difficultyLevel = difficultyLevel;
        this.playingStrategy = BotPlayingStrategyFactory
                .getStrategy(difficultyLevel);
    }

    @Override
    public Move makeMove(Board board) {
        System.out.println(getName() + "planning his move...");
        Move move = this.playingStrategy.makeMove(board);
        move.setPlayer(this);
        return move;
    }
}
