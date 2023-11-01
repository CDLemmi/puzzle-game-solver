package src.java;

import src.java.data.GameMove;
import src.java.data.GamePiece;
import src.java.data.GameState;

public class Tester {

    public static void main(String[] args) {
        System.out.println("Hello Mom!");
        GameState state = new GameState();
        System.out.println(state);
        GameMove move = new GameMove(GamePiece.BLUE, 9, 8);
        System.out.println(move);
        state.move(move);
        System.out.println(state);
    }

}