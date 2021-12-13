package clean.code.chess.requirements;

public class Pawn {

    private ChessBoard chessBoard;
    private int xCoordinate;
    private int yCoordinate;
    private PieceColor pieceColor;
    private boolean isFirstMove;

    public Pawn(PieceColor pieceColor) {
        this.pieceColor = pieceColor;
        this.isFirstMove = true;
    }

    public ChessBoard getChesssBoard() {
        return chessBoard;
    }

    public void setChessBoard(ChessBoard chessBoard) {
        this.chessBoard = chessBoard;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(int value) {
        this.xCoordinate = value;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(int value) {
        this.yCoordinate = value;
    }

    public PieceColor getPieceColor() {
        return this.pieceColor;
    }

    private void setPieceColor(PieceColor value) {
        pieceColor = value;
    }

    public void Move(MovementType movementType, int newX, int newY) {
        // Daca este o mutare inainte, celula trebuie sa fie goala
        // daca nu e goala, ne oprim
        if (movementType == MovementType.MOVE && this.chessBoard.IsLegalBoardPosition(newX, newY) == false) {
            return;
        }

        // Daca e negru trebuie sa se mute in jos
        if (this.pieceColor == PieceColor.BLACK && newX > this.xCoordinate) {
            return;
        }

        // Daca e alb trebuie sa se mute in sus
        if (this.pieceColor == PieceColor.WHITE && newX < this.xCoordinate) {
            return;
        }

        // Nu poate fi mutat mai mult de doua casute
        if (Math.abs(this.xCoordinate - newX) >= 2) {
            return;
        }

        this.chessBoard.MovePawnToCoord(this, newX, newY);

        this.xCoordinate = newX;
        this.yCoordinate = newY;
    }

    @Override
    public String toString() {
        return CurrentPositionAsString();
    }

    protected String CurrentPositionAsString() {
        String eol = System.lineSeparator();
        return String.format("Current X: {1}{0}Current Y: {2}{0}Piece Color: {3}", eol, xCoordinate, yCoordinate, pieceColor);
    }
}
