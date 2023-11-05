package src.java.control;

import src.java.data.GameState;
import src.java.gui.FieldPanel;

import javax.swing.*;

public class GUIControl {

    private JFrame frame;
    private FieldPanel fieldPanel;



    GUIControl(FPClickable f) {
        init();
        setupMouseListener(f);
    }

    private void init() {
        frame = new JFrame("puzzle-game-solver");
        fieldPanel = new FieldPanel();
        frame.add(fieldPanel);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        //im sorry; look GitHub issue #1
        frame.setSize(501, 400);
        frame.setSize(500, 400);
    }

    GameState getDisplayedState() {
        return fieldPanel.getDisplayedState();
    }

    public void setupMouseListener(FPClickable f) {
        fieldPanel.setupMouseListener(f);
    }

    void repaint() {
        fieldPanel.repaint();
    }




}
