package MachineCodingCaseStudies.TicTacToe1.Strategies.BotPlayingStrategy;

import MachineCodingCaseStudies.TicTacToe1.Board;
import MachineCodingCaseStudies.TicTacToe1.Cell;
import MachineCodingCaseStudies.TicTacToe1.CellState;
import MachineCodingCaseStudies.TicTacToe1.Move;

import java.util.List;

public class EasyStrategy implements BotDifficultyStrategy {
    @Override
    public Move makeMove(Board board) {
        for(List<Cell> lists:board.getBoard())
        {
            for(Cell cell: lists)
            {
                if(cell.getCellState().equals(CellState.EMPTY))
                {
                    return new Move(new Cell(cell.getRow(),cell.getCol()),null);
                }
            }
        }
        return null;
    }
}
