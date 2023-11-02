package src.java;

import src.java.gui.FieldPanel;

import javax.swing.*;

public class Tester {

    public static void main(String[] args) {
        System.out.println("Hello Mom!");
        JFrame frame = new JFrame("puzzle-game-solver");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        FieldPanel panel = new FieldPanel();
        frame.add(panel);
        frame.setSize(501,400);
        frame.setSize(500,400);

    }

}