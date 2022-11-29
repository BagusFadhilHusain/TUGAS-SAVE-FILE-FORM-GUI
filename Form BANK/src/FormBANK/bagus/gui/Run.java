package FormBANK.bagus.gui;

import javax.swing.*;

public class Run {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Data");
        jFrame.setContentPane(new BANKbagus().getRootPanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(600, 500);
        jFrame.setVisible(true);
    }
}
