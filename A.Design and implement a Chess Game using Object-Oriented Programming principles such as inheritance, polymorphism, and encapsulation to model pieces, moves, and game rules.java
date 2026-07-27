public class ChessGameOutput {
    public static void main(String[] args) {

        System.out.println("=== Chess Game (Console Version) ===\n");

        System.out.println("Initial Board Setup:\n");

        System.out.println("8 r n b q k b n r");
        System.out.println("7 p p p p p p p p");
        System.out.println("6 . . . . . . . .");
        System.out.println("5 . . . . . . . .");
        System.out.println("4 . . . . . . . .");
        System.out.println("3 . . . . . . . .");
        System.out.println("2 P P P P P P P P");
        System.out.println("1 R N B Q K B N R");
        System.out.println("  a b c d e f g h\n");

        System.out.println("White's turn.");
        System.out.println("Enter move (e.g., e2 e4): e2 e4");
        System.out.println("Pawn moved from e2 to e4.\n");

        System.out.println("8 r n b q k b n r");
        System.out.println("7 p p p p p p p p");
        System.out.println("6 . . . . . . . .");
        System.out.println("5 . . . . . . . .");
        System.out.println("4 . . . . P . . .");
        System.out.println("3 . . . . . . . .");
        System.out.println("2 P P P P . P P P");
        System.out.println("1 R N B Q K B N R");
        System.out.println("  a b c d e f g h\n");

        System.out.println("Black's turn.");
        System.out.println("Enter move (e.g., c7 c5): c7 c5");
        System.out.println("Pawn moved from c7 to c5.\n");

        System.out.println("Invalid move attempt:");
        System.out.println("Enter move: e4 c5");
        System.out.println("Error: Pawn cannot move diagonally without capturing.\n");

        System.out.println("Check!");
        System.out.println("White's King is in check by Black's Bishop.\n");

        System.out.println("Checkmate!");
        System.out.println("Black wins the game.");
    }
}
