package com.scaler.TicTacToe;

import com.scaler.TicTacToe.Controllers.GameController;
import com.scaler.TicTacToe.Models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // We are mocking/hardcoding user creation
        List<Player> players = new ArrayList<>();
        players.add(new HumanPlayer("Akash", new Symbol('X'), "akash.pal@gmail.com"));
        players.add(new BotPlayer("Botty", new Symbol('O'), BotDifficultyLevel.EASY));

        List<WinningStrategyType>  winningStrategyTypes = new ArrayList<>();
        winningStrategyTypes.add(WinningStrategyType.ROW);
        winningStrategyTypes.add(WinningStrategyType.COLUMN);

        GameController gameController = new GameController();
        Game game = gameController.startGame(3, players, winningStrategyTypes);

        gameController.display(game);
        while(gameController.checkGameStatus(game).equals(GameState.IN_PROGRESS)){
            gameController.makeMove(game);
            gameController.display(game);
            System.out.println("Do you want to undo the previous move? (Y/N)");
            String choice = scanner.nextLine();
            if(choice.equalsIgnoreCase("Y")){
                gameController.undo(game);
            }
        }

        if(gameController.checkGameStatus(game).equals(GameState.WON)){
            System.out.println(gameController.getWinner(game).getName() + "has won the game!");
        }else{
            System.out.println("Game is a draw!");
        }
    }
}