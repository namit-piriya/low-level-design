public class Knight extends Pieces {
    Color color;
    Square square;

    Knight(Color color, Square sq) {
        this.color = color;
        this.square = sq;
    }


    @Override
    boolean validMove(Square sq) {
        int[] rowMovement = {2, -2};
        int[] colMovement = {1, -1};
        for (int k : rowMovement) {
            for (int i : colMovement) {
                int currCol = sq.col;
                int currRow = sq.row;
                currRow += k;
                currCol += i;
                if (checkPiece(new Square(currRow, currCol)) && currCol == sq.col && currRow == sq.row) {
                    return true;
                }
            }
        }
        colMovement = new int[]{2, -2};
        rowMovement = new int[]{1, -1};
        for (int k : rowMovement) {
            for (int i : colMovement) {
                int currCol = sq.col;
                int currRow = sq.row;
                currRow += k;
                currCol += i;
                if (checkPiece(new Square(currRow, currCol)) && currCol == sq.col && currRow == sq.row) {
                    return true;
                }
            }
        }
        return false;

    }

    @Override
    public void move(Square sq) {
        if (validMove(sq)) {
            square = sq;
        }
    }
}
