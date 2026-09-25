package com.scaler.TicTacToe.Controllers;

import com.scaler.TicTacToe.Models.Game;
import com.scaler.TicTacToe.Models.GameState;
import com.scaler.TicTacToe.Models.Player;
import com.scaler.TicTacToe.Models.WinningStrategyType;

import java.util.List;

// API - appname/api/v1/startgame - return gameId
// API - appname/api/v1/getGameDetails(gameId) - board, etc.
// API - appname/api/v1/makemove(player, gameId, etc) -

public class GameController {
    public Game startGame(Integer dimension, List<Player> players, List<WinningStrategyType> types){
        return Game.getBuilder()
                .setDimension(dimension)
                .setWinningStrategyTypes(types)
                .setPlayers(players)
                .build();
    }

    public void makeMove(Game game){
        game.makeMove();
    }

    public void display(Game game){
        game.displayBoard();
    }

    public GameState checkGameStatus(Game game){
        return game.getState();
    }

    public Player getWinner(Game game){
        return game.getWinner();
    }

    public void undo(Game game) {
        game.undo();
    }
}
