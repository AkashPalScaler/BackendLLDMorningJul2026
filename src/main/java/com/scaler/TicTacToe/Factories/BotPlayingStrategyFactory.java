package com.scaler.TicTacToe.Factories;

import com.scaler.TicTacToe.Exceptions.InvalidPlayerSize;
import com.scaler.TicTacToe.Models.BotDifficultyLevel;
import com.scaler.TicTacToe.Strategies.BotPlayingStrategy;
import com.scaler.TicTacToe.Strategies.EasyBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getStrategy(BotDifficultyLevel level){
        if(level.equals(BotDifficultyLevel.EASY)){
            return new EasyBotPlayingStrategy();
        }else{
            throw new IllegalArgumentException("Invalid Bot Difficulty Level");
        }
    }
}
