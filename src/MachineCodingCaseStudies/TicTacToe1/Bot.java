package MachineCodingCaseStudies.TicTacToe1;

import MachineCodingCaseStudies.TicTacToe1.Factories.BotFactory;
import MachineCodingCaseStudies.TicTacToe1.Strategies.BotPlayingStrategy.BotDifficultyStrategy;

public class Bot extends Player{
    @Override
    public Move makeNextMove(Board board) {
        Move move=botDifficultyStrategy.makeMove(board);
        move.setPlayer(this);
        return move;
    }

    BotDifficulty botDifficulty;
    BotDifficultyStrategy botDifficultyStrategy;

    public Bot(String name, long id, Symbol symbol, BotDifficulty botDifficulty) {
        super(name, id, symbol);
        this.botDifficulty = botDifficulty;
        this.setPlayerType(PlayerType.BOT);
        this.botDifficultyStrategy= BotFactory.getBotPlayingStrategy(botDifficulty);
    }
}
