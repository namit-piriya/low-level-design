import java.util.ArrayList;
import java.util.List;

public class ChessBoard {

    List<List<Pieces>> chessBoard = new ArrayList<>();

    Pieces getPiece(Square sq) {
        ArrayList<Pieces> row = (ArrayList<Pieces>) chessBoard.get(sq.row);
        return row.get(sq.col);
    }

    private void fillTheBoard(Color c) {
        List<Pieces> pieceList = chessBoard.get(0);
        pieceList.add(new Rock(c, new Square(0, 0)));
        pieceList.add(new Rock(c, new Square(0, 7)));
        pieceList.add(new Bishop(c, new Square(0, 1)));
        pieceList.add(new Bishop(c, new Square(0, 6)));
        pieceList.add(new Knight(c, new Square(0, 2)));
        pieceList.add(new Knight(c, new Square(0, 5)));
        pieceList.add(new Queen(c, new Square(0, 4)));
        pieceList.add(new King(c, new Square(0, 3)));

        List<Pieces> pieceListSecond = chessBoard.get(1);
        for (int i = 0; i < 8; i++) {
            Pieces pawn = new Pawn(c, new Square(1, i));
            pieceListSecond.add(pawn);
        }
    }

    ChessBoard() {
        for (int i = 0; i < 8; i++) {
            chessBoard.add(new ArrayList<Pieces>());
        }
    }


    void initiate() {
        fillTheBoard(Color.White);
        fillTheBoard(Color.Black);
    }

}
