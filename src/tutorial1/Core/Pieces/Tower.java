package tutorial1.Core.Pieces;

public class Tower extends Piece {
    public Tower(Piece[][] board, int posX, int posY, boolean isWhite) {
        super(3, posX, posY, board, isWhite);
    }

    @Override
    protected boolean checkIfValid(int x, int y) {
        return false;
    }

}
