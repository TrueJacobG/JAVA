package firstGui;

import java.awt.*;
import javax.swing.*;

public class betterLabel extends JComponent {
    public void paintComponent(Graphics g) {
        g.drawString("Welcome", 125, 100);
    }
}
