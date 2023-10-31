package src.java.data;

import java.util.Arrays;

public class GameState {

    private int w;
    private int v;
    private int[] h;
    private int[] b;



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
