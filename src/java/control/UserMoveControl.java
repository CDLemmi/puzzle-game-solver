package src.java.control;

import src.java.data.GameMove;
import src.java.data.GamePiece;
import src.java.data.GameState;

public class UserMoveControl {

    GameState state;

    int selected;
    GamePiece piece;



    UserMoveControl(GameState state) {
        this.state = state;
        selected = -1;
    }

    void processClick(int pos) {
        if(selected == -1) {
            if(pos == state.getW() || pos == state.getW()+1 || pos == state.getW()+5 || pos == state.getW()+6) {
                selected = state.getW();
                piece = GamePiece.WHITE;
            } else if(state.getV() == pos || state.getV() == pos-5) {
                selected = state.getV();
                piece = GamePiece.VERTICAL;
            } else {
                for(int i = 0; i < 4; i++) {
                    if(state.getH()[i] == pos || state.getH()[i]+1 == pos) {
                        selected = state.getH()[i];
                        piece = GamePiece.HORIZONTAL;
                    }
                    if(state.getB()[i] == pos) {
                        selected = state.getB()[i];
                        piece = GamePiece.BLUE;

                    }
                }
            }
        } else {
            state.move(new GameMove(piece, selected, pos));
            selected = -1;
        }

    }



}
