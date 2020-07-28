package tutorial1.Core.Pieces;

public class Pawn extends Piece {

    public Pawn(Piece[][] board, int posX, int posY, boolean isWhite) {
        super(0, posX, posY, board, isWhite);
    }

    @Override
    protected boolean checkIfValid(int x, int y) {

        return false;
    }

}
