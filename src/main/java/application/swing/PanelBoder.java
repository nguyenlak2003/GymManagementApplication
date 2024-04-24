
package application.swing;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Lăk
 */
public class PanelBoder extends JPanel{
    public PanelBoder(){
        setBounds(50, 50, 300, 400);
        setOpaque(false);
    }
    
    public void paintChildren(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint grphcs = new GradientPaint(0, 0, Color.decode("#43cea2"), 0, getHeight(), Color.decode("#185a9d"));
        g2.setPaint(grphcs);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        super.paintChildren(g);
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(0, 0, 1280, 720);
        frame.setLayout(null);
        frame.add(new PanelBoder());
        frame.setVisible(true);
    }
}
