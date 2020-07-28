package tutorial1.Core.Pieces;

public class King extends Piece {
    public King(Piece[][] board, int posX, int posY, boolean isWhite) {
        super(5, posX, posY, board, isWhite);
    }

    @Override
    protected boolean checkIfValid(int x, int y) {
        return false;
    }

}
