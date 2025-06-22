package MachineCodingCaseStudies.TicTacToe1.Controllers;

import MachineCodingCaseStudies.TicTacToe1.Exceptions.InvalidBotCount;
import MachineCodingCaseStudies.TicTacToe1.Exceptions.InvalidPlayerCount;
import MachineCodingCaseStudies.TicTacToe1.Game;
import MachineCodingCaseStudies.TicTacToe1.GameState;
import MachineCodingCaseStudies.TicTacToe1.Player;
import MachineCodingCaseStudies.TicTacToe1.Strategies.WinningStrategies.WinningStrategy;

import java.util.List;

public class GameController {
     public Game startGame(int dimensions, List<WinningStrategy> winningStrategies, List<Player> playerList) throws InvalidBotCount, InvalidPlayerCount {
        return Game.builder().setDimensions(dimensions).
                setWinningStrategies(winningStrategies).
                setPlayerList(playerList).
                setDimensions(dimensions).
                build();
     }

     public void makeNextMove(Game game)
     {
          game.makeNextMove();
     }

     public void printBoard(Game game)
     {
          game.printBoard();
     }

     public GameState getGameState(Game game)
     {
         return game.getGameState();
     }

     public void undo(Game game)
     {
          game.undo();
     }
}
