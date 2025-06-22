package MachineCodingCaseStudies.TicTacToe1;

import MachineCodingCaseStudies.TicTacToe1.Controllers.GameController;
import MachineCodingCaseStudies.TicTacToe1.Exceptions.InvalidBotCount;
import MachineCodingCaseStudies.TicTacToe1.Exceptions.InvalidPlayerCount;
import MachineCodingCaseStudies.TicTacToe1.Strategies.WinningStrategies.ColumnWinner;
import MachineCodingCaseStudies.TicTacToe1.Strategies.WinningStrategies.DiagnoalWinner;
import MachineCodingCaseStudies.TicTacToe1.Strategies.WinningStrategies.RowWinning;
import MachineCodingCaseStudies.TicTacToe1.Strategies.WinningStrategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws InvalidBotCount, InvalidPlayerCount {
        Scanner sc=new Scanner(System.in);
        GameController gameController =new GameController();
        Player human=new Player("Neel",123,new Symbol('X'));
        Bot bot=new Bot("Bot",124,new Symbol('O'),BotDifficulty.EASY);
        List<Player> playerList=new ArrayList<>();
        playerList.add(human);
        playerList.add(bot);
        List<WinningStrategy> winningStrategies = new ArrayList<>();
        winningStrategies.add(new RowWinning());
        winningStrategies.add(new ColumnWinner());
        winningStrategies.add(new DiagnoalWinner());
        Game game=gameController.startGame(3,winningStrategies,playerList);
        while(game.getGameState()==GameState.IN_PROGRESS)
        {
            gameController.printBoard(game);
            if(game.moves.size()!= 0 && game.moves.get(game.moves.size()-1).getPlayer().getPlayerType()==PlayerType.HUMAN) {
                System.out.println("Do you want to undo the move? (y/n)");
                String ans = sc.next();
                if (ans.equalsIgnoreCase("Y")) {
                    gameController.undo(game);
                    continue;
                }
            }
            gameController.makeNextMove(game);
        }
        game.printBoard();
        if(game.getGameState()==GameState.ENDED)
        {
            System.out.println("Game ended.Winner is"+" "+game.getWinner().getName());
        }
        else{
            System.out.println("Game has drawn");
        }
    }
}
