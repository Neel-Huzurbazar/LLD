package MachineCodingCaseStudies.TicTacToe1;

import java.util.ArrayList;
import java.util.List;

public class Board {
    int size;
    List<List<Cell>> board;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }

    public Board(int size) {
        this.size = size;
        this.board=new ArrayList(size);
        for(int i=0;i<size;i++)
        {
            this.board.add(new ArrayList<>(size));
            for(int j=0;j<size;j++)
            {
                this.board.get(i).add(new Cell(i,j));
            }
        }
    }

    public void printBoard()
    {
        for(List<Cell> list:board)
        {
            for(Cell cell:list)
            {
                cell.printCell();
            }
            System.out.println('\n');
        }
    }
}
