package tutorial1.Core.Pieces;

public class Bishop extends Piece {
    public Bishop(Piece[][] board, int posX, int posY, boolean isWhite) {
        super(2, posX, posY, board, isWhite);
    }

    @Override
    protected boolean checkIfValid(int x, int y) {
        return false;
    }

}
