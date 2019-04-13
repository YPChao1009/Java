/*
 * DrawPanel2.java
 * Author:Yun Pei Chao 
 */
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel2 extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        int d = 0;
        while(d<height) {
			g.drawLine(0,d,d,height);	// down right
			g.drawLine(width,d,width-d,height);	// down left
			g.drawLine(0,height-d,d,0); //up right
			g.drawLine(width,height-d,width-d,0); //up left
			d+=15;
        }
    }
}