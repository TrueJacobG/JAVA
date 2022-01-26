package firstGui;

import javax.swing.*;

public class firstGui {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello!");
        frame.add(new betterLabel());
        frame.setSize(800, 800);
        frame.setVisible(true);
    }
}
