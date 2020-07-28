package tutorial1.Core.Pieces;

public abstract class Piece {
    public final int ID;
    protected final Piece[][] Board;
    public boolean isWhite;
    protected int posX, posY;

    protected Piece(int id, int posX, int posY, Piece[][] board, boolean isWhite) {
        ID = id;
        Board = board;
        this.isWhite = isWhite;
        this.posX = posX;
        this.posY = posY;
    }

    public boolean doAction(int x, int y) {
        if (this.checkIfValidGeneric(x, y) && this.checkIfValid(x, y)) {
            this.movePiece(x, y);
            return true;
        } else {
            return false;
        }
    }

    protected boolean checkIfValidGeneric(int x, int y) {
        if (x >= 8 || y >= 8 || x < 0 || y < 0)
            return false;
        if (Board[x][y].isWhite == this.isWhite)
            return false;
        return true;

    }

    protected abstract boolean checkIfValid(int x, int y);

    private void movePiece(int x, int y) {
        Board[posX][posY] = null;

        posY = y;
        posX = x;

        Board[posX][posY] = this;
    }

    public String toString() {
        return Integer.toString(ID) + isWhite;
    }

}
