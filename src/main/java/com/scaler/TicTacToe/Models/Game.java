package com.scaler.TicTacToe.Models;

import com.scaler.TicTacToe.Factories.WinningStrategyFactory;
import com.scaler.TicTacToe.Strategies.WinningStrategy;
import com.scaler.TicTacToe.Validations.ValidatePlayerSize;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private Integer nextPlayerIndex;
    private List<WinningStrategyType> winningStrategyTypes; // A redundant, extra property
    private List<WinningStrategy> winningStrategies;
    private GameState state;
    private Player winner;
    private List<Move> moves;

    public GameState getState() {
        return state;
    }

    public void setState(GameState state) {
        this.state = state;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public Game(GameBuilder builder) {
        this.board = new Board(builder.getDimension());
        this.players = builder.getPlayers();
        this.winningStrategyTypes = builder.getWinningStrategyTypes();
        // Set all the winning strategies from types here
        this.winningStrategies = new ArrayList<>();
        for(WinningStrategyType winningStrategyType : winningStrategyTypes) {
            this.winningStrategies.add
                    (WinningStrategyFactory
                            .getWinningStrategy(winningStrategyType)
                    );
        }
        this.nextPlayerIndex = 0;
        this.state = GameState.IN_PROGRESS;
        this.moves = new ArrayList<>();
    }

    public static GameBuilder getBuilder(){
        return new GameBuilder();
    }

    public void makeMove(){
        // Identify current player
        Player player = players.get(nextPlayerIndex);
        // Ask the player to make the move
        Move move = player.makeMove(board);
        // Update the board and the cell
        Cell cellFromMove = move.getCell();
        this.board.getGrid().get(cellFromMove.getRow()).get(cellFromMove.getColumn()).setSymbol(move.getPlayer().getSymbol());
        this.board.getGrid().get(cellFromMove.getRow()).get(cellFromMove.getColumn()).setState(CellState.FILLED);
        // Update the moves(history)
        this.moves.add(move);
        // Check winner algorithm - Accordingly update gameState and winner
        for(WinningStrategy strategy : winningStrategies) {
            if(strategy.checkWinner(board, move)){
                this.state = GameState.WON;
                this.winner = move.getPlayer();
                break;
            }
        }
        // Check draw algorithm - Accordingly update gameState and winner
        if(this.state == GameState.IN_PROGRESS){
            if(moves.size() == board.getDimension()* board.getDimension()){
                this.state = GameState.DRAW;
            }
        }

        // Update the next player index for next player to make a move
        nextPlayerIndex++;
        nextPlayerIndex %= players.size();
    }

    public void displayBoard(){
        this.board.displayBoard();
    }

    public void undo() {
        // Remove and get the last move from moves
        Move lastMove =  moves.get(moves.size()-1);
        // Undo the board and cell update according to the move
        Cell cellFromMove = lastMove.getCell();
        this.board.getGrid().get(cellFromMove.getRow()).get(cellFromMove.getColumn()).setSymbol(null);
        this.board.getGrid().get(cellFromMove.getRow()).get(cellFromMove.getColumn()).setState(CellState.EMPTY);

        // Undo the game state and winner update if any required
        this.state = GameState.IN_PROGRESS;
        this.winner = null;

        // Undo the next player index | MOD arithmetics -  (a-b)%m = (a%m -b%m + m)%m
        nextPlayerIndex = (nextPlayerIndex - 1 + players.size())%players.size();
        // Undo the (all strategies) row,column, diagonal, corner count maps

    }

    public static class GameBuilder {
        private Integer dimension;
        private List<Player> players;
        private List<WinningStrategyType> winningStrategyTypes;

        public Integer getDimension() {
            return dimension;
        }

        public GameBuilder setDimension(Integer dimension) {
            this.dimension = dimension;
            return this;
        }

        public List<Player> getPlayers() {
            return players;
        }

        public GameBuilder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public List<WinningStrategyType> getWinningStrategyTypes() {
            return winningStrategyTypes;
        }

        public GameBuilder setWinningStrategyTypes(List<WinningStrategyType> winningStrategyTypes) {
            this.winningStrategyTypes = winningStrategyTypes;
            return this;
        }

        public Game  build() {
            // Validations
            ValidatePlayerSize.validate(this.players, this.dimension);
            // ValidateUniquePlayers - Using a set
            return new Game(this);
        }
    }

}