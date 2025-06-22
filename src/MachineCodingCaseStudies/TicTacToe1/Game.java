package MachineCodingCaseStudies.TicTacToe1;

import MachineCodingCaseStudies.TicTacToe1.Exceptions.InvalidBotCount;
import MachineCodingCaseStudies.TicTacToe1.Exceptions.InvalidPlayerCount;
import MachineCodingCaseStudies.TicTacToe1.Strategies.WinningStrategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    Board board;
    Player winner;
    List<Player> playerList;
    List<Move> moves;
    List<WinningStrategy> winningStrategies;
    GameState gameState;
    int nextPlayer;
    int dimensions;

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public int getNextPlayer() {
        return nextPlayer;
    }

    public void setNextPlayer(int nextPlayer) {
        this.nextPlayer = nextPlayer;
    }

    public int getDimensions() {
        return dimensions;
    }

    public void setDimensions(int dimensions) {
        this.dimensions = dimensions;
    }

    public static class GameBuilder{
        List<Player> playerList;
        List<WinningStrategy> winningStrategies;
        int dimensions;

        public List<Player> getPlayerList() {
            return playerList;
        }

        public GameBuilder setPlayerList(List<Player> playerList) {
            this.playerList = playerList;
            return this;
        }

        public List<WinningStrategy> getWinningStrategies() {
            return winningStrategies;
        }

        public GameBuilder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        public int getDimensions() {
            return dimensions;
        }

        public GameBuilder setDimensions(int dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        public Game build() throws InvalidBotCount, InvalidPlayerCount {
            return new Game(this);
        }
    }
    private Game(GameBuilder builder) throws InvalidBotCount, InvalidPlayerCount {
        this.playerList = builder.getPlayerList();
        this.dimensions=builder.getDimensions();
        this.winningStrategies=builder.getWinningStrategies();
        board=new Board(dimensions);
        gameState=GameState.IN_PROGRESS;
        moves=new ArrayList<>();
        //validations
        validateBotCount();
        validatePlayerCount();
    }
    public static GameBuilder builder()
    {
        return new GameBuilder();
    }

    public boolean validateBotCount() throws InvalidBotCount {
        int count= (int) playerList.stream().filter(player->player.getPlayerType()==PlayerType.BOT).count();
        if(count>1)
        {
            throw new InvalidBotCount("One one  bot is allowed to play");
        }
        return true;
    }

    public boolean validatePlayerCount() throws InvalidPlayerCount {
        if(playerList.size()!=dimensions-1)
        {
            throw new InvalidPlayerCount("N-1 players are allowed to play");
        }
        return true;
    }
    public boolean validateMove(Move move)
    {
        if(move.getCell().getCellState()==CellState.FILLED)
        {
            System.out.println("Cell is not available");
            return false;
        }
        if(move.getCell().getRow()>=dimensions || move.getCell().getCol()>=dimensions)
        {
            System.out.println("Invalid move");
            return false;
        }
        return true;
    }
    public boolean checkWinner(Move move)
    {
        for(WinningStrategy winningStrategy:winningStrategies)
        {
            if(winningStrategy.checkWinner(move,dimensions)) return true;
        }
        return false;
    }
    public void makeNextMove()
    {
        Player player=this.playerList.get(nextPlayer);
        Move move=player.makeNextMove(board);
        if(!validateMove(move)) return;
        int row=move.getCell().getRow();
        int col=move.getCell().getCol();
        Cell cellToChange=board.getBoard().get(row).get(col);
        cellToChange.setCellState(CellState.FILLED);
        cellToChange.setPlayer(player);
        Move finalMove=new Move(cellToChange,player);
        this.moves.add(finalMove);
        nextPlayer+=1;
        nextPlayer=nextPlayer % playerList.size();
        if(checkWinner(move))
        {
            winner=player;
            gameState=GameState.ENDED;
        }
        else if(moves.size()==dimensions*dimensions)
        {
            gameState=GameState.TIE;
        }
    }

    public void printBoard()
    {
        board.printBoard();
    }

    public void undo()
    {
        if(moves.size()==0)
        {
            System.out.println("No moves available to undo");
            return;
        }
        Move lastMove=moves.get(moves.size()-1);
        moves.remove(lastMove);
        Cell cellToDelete=lastMove.getCell();
        cellToDelete.setPlayer(null);
        cellToDelete.setCellState(CellState.EMPTY);

        nextPlayer=(nextPlayer-1+playerList.size()) % playerList.size();
    }
}
