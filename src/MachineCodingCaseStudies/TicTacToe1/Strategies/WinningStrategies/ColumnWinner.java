package MachineCodingCaseStudies.TicTacToe1.Strategies.WinningStrategies;

import MachineCodingCaseStudies.TicTacToe1.Move;
import MachineCodingCaseStudies.TicTacToe1.Symbol;

import java.util.HashMap;
import java.util.Map;

public class ColumnWinner implements WinningStrategy{
    Map<Integer, Map<Symbol,Integer>> map=new HashMap<>();
    @Override
    public boolean checkWinner(Move move,int dimensions) {
        int col=move.getCell().getCol();
        Symbol symbol=move.getPlayer().getSymbol();
        if(!map.containsKey(col))
        {
            map.put(col,new HashMap<>());
        }
        Map<Symbol,Integer> m=map.get(col);
        m.put(symbol,m.getOrDefault(symbol,0)+1);
        if(m.get(symbol)==dimensions)
        {
            return true;
        }
        return false;
    }

    @Override
    public void handleUndo(Move move, int dimensions) {
        int col=move.getCell().getCol();
        Symbol symbol=move.getPlayer().getSymbol();
        Map<Symbol,Integer> m=map.get(col);
        m.put(symbol,m.get(symbol)-1);
    }
}
