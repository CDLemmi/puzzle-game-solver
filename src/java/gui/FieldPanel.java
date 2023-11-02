package src.java.gui;

import src.java.data.GameState;

import javax.swing.*;
import java.awt.*;

public class FieldPanel extends JPanel {



    public GameState state;

    int xSize;
    int ySize;

    public FieldPanel() {
        Textures.load();
        state = new GameState();
        repaint();
    }


    void draw(Graphics g, int pos, Type type) {
        int x = (pos%5) * xSize;
        int y = (pos/5) * ySize;
        g.drawImage(Textures.getImage(type), x, y, xSize, ySize, null);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int totalHeight = getHeight();
        int totalWidth = getWidth();

        xSize = totalWidth / 5;
        ySize = totalHeight / 4;

        int pos;

        for(int i = 0; i < 4; i++) {
            pos = state.getB()[i];
            draw(g, pos, Type.BLUE);
        }

        for(int i = 0; i < 4; i++) {
            pos = state.getH()[i];
            draw(g, pos, Type.LEFT_HORIZONTAL);
            pos++;
            draw(g, pos, Type.RIGHT_HORIZONTAL);
        }

        pos = state.getW();
        draw(g, pos, Type.UPPER_LEFT_WHITE);
        pos++;
        draw(g, pos, Type.UPPER_RIGHT_WHITE);
        pos += 4;
        draw(g, pos, Type.LOWER_LEFT_WHITE);
        pos++;
        draw(g, pos, Type.LOWER_RIGHT_WHITE);

        pos = state.getV();
        draw(g, pos, Type.UPPER_VERTICAL);
        pos += 5;
        draw(g, pos, Type.LOWER_VERTICAL);

    }


}
