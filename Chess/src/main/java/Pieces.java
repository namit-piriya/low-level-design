public interface Pieces {

    boolean killed = false;

    Color pieceColor = null;
    boolean isKilled();
    
    void move();

    boolean validMove(int row, int col);
}
