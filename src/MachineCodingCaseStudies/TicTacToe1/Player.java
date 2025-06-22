package MachineCodingCaseStudies.TicTacToe1;

import java.util.Scanner;

public class Player {
    private String name;
    private long id;
    private Symbol symbol;
    private PlayerType playerType;
    private Scanner sc;

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", symbol=" + symbol +
                ", playerType=" + playerType +
                '}';
    }

    public Player(String name, long id, Symbol symbol) {
        this.name = name;
        this.id = id;
        this.symbol = symbol;
        this.playerType = PlayerType.HUMAN;
        sc=new Scanner(System.in);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public Move makeNextMove(Board board)
    {
        System.out.println("Please enter a row number");
        int row=sc.nextInt();
        System.out.println("Please enter a column number");
        int col=sc.nextInt();
        return new Move(new Cell(row,col),this);
    }
}
