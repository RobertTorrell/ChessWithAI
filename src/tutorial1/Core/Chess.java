package tutorial1.Core;

import tutorial1.Core.Pieces.*;


public class Chess {
    public Piece[][] Board;
    public King whiteKing, blackKing;
    public Player playerWhite, playerBlack, activePlayer, aiPlayer, enemyPlayer;

    public Chess(boolean startsAsWhite) {
        Board = new Piece[8][8];
        playerWhite = new Player(true);
        playerBlack = new Player(false);
        activePlayer = playerWhite;

        if (startsAsWhite) {
            aiPlayer = playerWhite;
            enemyPlayer = playerBlack;
        } else {
            aiPlayer = playerBlack;
            enemyPlayer = playerWhite;
        }

        boolean isWhiteDone = false;
        for (int i = 0; i < 8; i++) {
            boolean isPawnRow = i == 1 || i == 6;
            boolean isPiecesRow = i == 0 || i == 7;
            for (int j = 0; j < 8; j++) {

                if (isPawnRow) {
                    if (!isWhiteDone) {
                        Board[i][j] = new Pawn(Board, i, j, playerWhite.isWhite);
                        if (j == 7) isWhiteDone = true;
                    } else
                        Board[i][j] = new Pawn(Board, i, j, playerBlack.isWhite);

                } else if (isPiecesRow) {
                    boolean isWhite = !isWhiteDone;

                    if (j == 0 || j == 7)
                        Board[i][j] = new Tower(Board, i, j, isWhite);
                    else if (j == 1 || j == 6)
                        Board[i][j] = new Knight(Board, i, j, isWhite);
                    else if (j == 2 || j == 5)
                        Board[i][j] = new Bishop(Board, i, j, isWhite);
                    else if (j == 3)
                        Board[i][j] = new Queen(Board, i, j, isWhite);
                    else Board[i][j] = new King(Board, i, j, isWhite);

                }
            }
        }
    }

    public String toString() {
        StringBuilder bufferS = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            bufferS.append("|");
            for (int j = 0; j < 8; j++) {
                Piece actualPiece = Board[i][j];
                bufferS.append(actualPiece).append("|");
            }
            bufferS.append('\n');
        }
        return bufferS.toString();
    }

    public int isGameFinished() {
        return 0;
    }
}
