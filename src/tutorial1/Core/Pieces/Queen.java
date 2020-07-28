package tutorial1.Core.Pieces;

public class Queen extends Piece {
    public Queen(Piece[][] board, int posX, int posY, boolean isWhite) {
        super(4, posX, posY, board, isWhite);
    }

    @Override
    protected boolean checkIfValid(int x, int y) {
        return false;
    }

}
