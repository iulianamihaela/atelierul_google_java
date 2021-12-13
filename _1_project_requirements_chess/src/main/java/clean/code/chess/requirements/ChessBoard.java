package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];

        // Umplem matricea cu null
        for (int i = 0; i < MAX_BOARD_WIDTH; i++) {
            for (int j = 0; j < MAX_BOARD_HEIGHT; j++) {
                pieces[i][j] = null;
            }
        }
    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        if (this.IsLegalBoardPosition(xCoordinate, yCoordinate) == false) {
            pawn.setXCoordinate(-1);
            pawn.setYCoordinate(-1);

            return;
        }

        // Daca pozitia nu este libera ne oprim
        if (pieces[xCoordinate][yCoordinate] != null) {
            return;
        }

        // Punem pionul
        pieces[xCoordinate][yCoordinate] = pawn;
        // Setam coordonatele pionului
        pawn.setXCoordinate(xCoordinate);
        pawn.setYCoordinate(yCoordinate);
        // Adaugam legatura catre tabla de joc
        pawn.setChessBoard(this);
    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        // Verificam daca coordonata x nu este in cadrul tablei
        if (xCoordinate < 0 || xCoordinate >= MAX_BOARD_WIDTH) {
            return false;
        }

        // Verificam daca coordonata y nu este in cadrul tablei
        if (yCoordinate < 0 || yCoordinate >= MAX_BOARD_HEIGHT) {
            return false;
        }

        return true;
    }

    public void MovePawnToCoord(Pawn pawn, int newX, int newY) {
        this.pieces[pawn.getXCoordinate()][pawn.getYCoordinate()] = null;
        this.pieces[newX][newY] = pawn;
    }
}
