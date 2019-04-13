/*
 * DrawPanel.java
 * Author:Yun Pei Chao 
 */
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        int d = 0;
        while(d<height) {
            g.drawLine(0, d, d, height);
            d += 15;
        }
    }
}