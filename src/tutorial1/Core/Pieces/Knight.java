package tutorial1.Core.Pieces;

public class Knight extends Piece {
    public Knight(Piece[][] board, int posX, int posY, boolean isWhite) {
        super(1, posX, posY, board, isWhite);
    }

    @Override
    protected boolean checkIfValid(int x, int y) {
        return false;
    }


}
