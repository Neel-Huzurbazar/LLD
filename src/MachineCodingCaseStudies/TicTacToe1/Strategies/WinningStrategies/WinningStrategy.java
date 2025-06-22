package MachineCodingCaseStudies.TicTacToe1.Strategies.WinningStrategies;

import MachineCodingCaseStudies.TicTacToe1.Move;

public interface WinningStrategy {
    public boolean checkWinner(Move move,int dimensions);
    public void handleUndo(Move move,int dimensions);
}
