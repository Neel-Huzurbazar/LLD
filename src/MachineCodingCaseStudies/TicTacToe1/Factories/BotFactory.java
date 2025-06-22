package MachineCodingCaseStudies.TicTacToe1.Factories;

import MachineCodingCaseStudies.TicTacToe1.BotDifficulty;
import MachineCodingCaseStudies.TicTacToe1.Strategies.BotPlayingStrategy.BotDifficultyStrategy;
import MachineCodingCaseStudies.TicTacToe1.Strategies.BotPlayingStrategy.EasyStrategy;
import MachineCodingCaseStudies.TicTacToe1.Strategies.BotPlayingStrategy.HardStrategy;
import MachineCodingCaseStudies.TicTacToe1.Strategies.BotPlayingStrategy.MediumStrategy;

public class BotFactory {
    public static BotDifficultyStrategy getBotPlayingStrategy(BotDifficulty botDifficulty)
    {
        if(botDifficulty==BotDifficulty.EASY) return new EasyStrategy();
        else if(botDifficulty==BotDifficulty.MEDIUM) return new MediumStrategy();
        else if(botDifficulty==BotDifficulty.HARD) return new HardStrategy();
        else return new EasyStrategy();
    }
}
