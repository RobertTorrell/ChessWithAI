package tutorial1;

import tutorial1.Core.AI.AI;
import tutorial1.Core.Chess;
import tutorial1.Core.Pieces.Piece;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Chess chessController;
        Scanner scan = new Scanner(System.in);
        System.out.print("Plis, digues 0 si ets Blanques, 1 si ets negres: ");
        int aiPlayerInput = scan.nextInt();

        if (aiPlayerInput == 0) {
            chessController = new Chess(true);
        } else {
            chessController = new Chess(false);
        }

        AI ai = new AI();

        System.out.println(chessController);

        while (chessController.isGameFinished() == 0) {
            chessController.activePlayer.isActive = true;
            if (chessController.aiPlayer == chessController.activePlayer) {
                int[] aiResult = ai.Process();
                Piece playerPiece = chessController.Board[aiResult[0]][aiResult[1]];
                playerPiece.doAction(aiResult[2], aiResult[3]);

                System.out.println("El sistema ha escullit la fitxa a: " + aiResult[0] + "," + aiResult[1] + "I l'ha mogut a: " + aiResult[2] + "," + aiResult[3] + ".");
                chessController.activePlayer = chessController.enemyPlayer;

            } else {
                System.out.print("Plis, escriu coordenades de fitxa del contrincant: ");
                int xEnemyPlayerPiece = scan.nextInt();
                int yEnemyPlayerPiece = scan.nextInt();

                Piece enemyPiece = chessController.Board[xEnemyPlayerPiece][yEnemyPlayerPiece];

                System.out.println("Plis, escriu coordenades del moviment: ");
                xEnemyPlayerPiece = scan.nextInt();
                yEnemyPlayerPiece = scan.nextInt();

                enemyPiece.doAction(xEnemyPlayerPiece, yEnemyPlayerPiece);

                chessController.enemyPlayer = chessController.activePlayer;
            }

            System.out.println(chessController);
        }
        System.out.println("FINISH");
    }
}
