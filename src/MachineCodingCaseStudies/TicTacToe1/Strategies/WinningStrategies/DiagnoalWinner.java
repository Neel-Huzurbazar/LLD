package MachineCodingCaseStudies.TicTacToe1.Strategies.WinningStrategies;

import MachineCodingCaseStudies.TicTacToe1.Move;
import MachineCodingCaseStudies.TicTacToe1.Symbol;

import java.util.HashMap;
import java.util.Map;

public class DiagnoalWinner implements WinningStrategy{
    Map<Symbol, Integer> diagonal=new HashMap<>();
    Map<Symbol,Integer> antiDigonal=new HashMap<>();
    @Override
    public boolean checkWinner(Move move,int dimensions) {
        int row=move.getCell().getRow();
        int col=move.getCell().getCol();
        Symbol symbol=move.getPlayer().getSymbol();
        if(row==col)
        {
            diagonal.put(symbol,diagonal.getOrDefault(symbol,0)+1);
            if(diagonal.get(symbol)==dimensions)
            {
                return true;
            }
        }
        if(row+col==dimensions-1)
        {
            antiDigonal.put(symbol,antiDigonal.getOrDefault(symbol,0)+1);
            if(antiDigonal.get(symbol)==dimensions)
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public void handleUndo(Move move, int dimensions) {
        int row=move.getCell().getRow();
        int col=move.getCell().getCol();
        Symbol symbol=move.getPlayer().getSymbol();
        if(row==col)
        {
            diagonal.put(symbol,diagonal.get(symbol)-1);
        }
        if(row+col==dimensions-1)
        {
            antiDigonal.put(symbol,antiDigonal.get(symbol)-1);
        }

    }
}
