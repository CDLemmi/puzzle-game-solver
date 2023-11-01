package src.java.data;

public class GameMove {

    GamePiece piece;
    int pos1;
    int pos2;

    public GameMove(GamePiece piece, int pos1, int pos2) {
        this.piece = piece;
        this.pos1 = pos1;
        this.pos2 = pos2;
    }

    public int getDifferentPosition(int input) {
        if(pos1 == input) return pos2;
        if(pos2 == input) return pos1;
        return -1;
    }

    public String toString() {
        StringBuilder s = new StringBuilder("GameMove(");
        s.append(switch(piece) {
            case WHITE -> "W";
            case VERTICAL -> "V";
            case HORIZONTAL -> "H";
            case BLUE -> "B";
        });
        s.append("|");
        s.append(pos1);
        s.append("<->");
        s.append(pos2);
        s.append(")");
        return s.toString();
    }

}
