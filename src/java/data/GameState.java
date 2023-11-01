package src.java.data;

import java.util.Arrays;

public class GameState {

    private int w;
    private int v;
    private int[] h;
    private int[] b;


    public GameState() {
        setW(5);
        setV(7);
        setH(new int[] {0,2,15,17});
        setB(new int[] {4,8,13,19});
    }


    public void move(GameMove move) {
        switch(move.piece) {
            case WHITE -> {
                int m = move.getDifferentPosition(w);
                if(m != -1) throw new IllegalArgumentException("move failed");
                w = m;
            }
            case VERTICAL -> {
                int m = move.getDifferentPosition(v);
                if(m != -1) throw new IllegalArgumentException("move failed");
                v = m;
            }
            case HORIZONTAL -> {
                boolean exists = false;
                for(int i = 0; i < 4; i++) {
                    int m = move.getDifferentPosition(h[i]);
                    if(m != -1) {
                        h[i] = m;
                        exists = true;
                        break;
                    }
                }
                if(!exists) throw new IllegalArgumentException("move failed");
            }
            case BLUE -> {
                boolean exists = false;
                for(int i = 0; i < 4; i++) {
                    int m = move.getDifferentPosition(b[i]);
                    if(m != -1) {
                        b[i] = m;
                        exists = true;
                        break;
                    }
                }
                if(!exists) throw new IllegalArgumentException("move failed");
            }

        }
    }


    public String toString() {
        StringBuilder s = new StringBuilder("GameState(W=");
        s.append(getW());
        s.append("|V=");
        s.append(getV());
        s.append("|H=");
        for(int i = 0; i < 4; i++) {
            s.append(getH()[i]);
            s.append(",");
        }
        s.setCharAt(s.length() - 1, '|');
        s.append("B=");
        for(int i = 0; i < 4; i++) {
            s.append(getB()[i]);
            s.append(",");
        }
        s.setCharAt(s.length() - 1, ')');
        return s.toString();
    }



    void setW(int n) {
        w = n;
    }

    void setV(int n) {
        v = n;
    }

    void setH(int[] n) {
        h = Arrays.copyOf(n, 4);
    }

    void setB(int[] n) {
        b = Arrays.copyOf(n, 4);
    }


    public int getW() {
        return w;
    }

    public int getV() {
        return v;
    }

    public int[] getH() {
        return Arrays.copyOf(h, 4);
    }

    public int[] getB() {
        return Arrays.copyOf(b, 4);
    }


}
