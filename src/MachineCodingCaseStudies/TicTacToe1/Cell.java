package MachineCodingCaseStudies.TicTacToe1;

public class Cell {
    int row;
    int col;
    Player player;
    CellState cellState;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.cellState=CellState.EMPTY;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public CellState getCellState() {
        return cellState;
    }

    public void setCellState(CellState cellState) {
        this.cellState = cellState;
    }

    public void printCell()
    {
        if(cellState==CellState.EMPTY)
        {
            System.out.print(" -- ");
        }
        else{
            System.out.print(" "+player.getSymbol().symbol+" ");
        }
    }
}
