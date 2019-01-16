package packagethree;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class MyButton extends JButton {
	
	
	// w = 86
	// h = 26
	// d = 50
	// r = 13
	
	@Override
	protected void paintComponent(Graphics g) {
//		System.out.println(getSize().width); 就是width
		if (getModel().isArmed())
        {
//            System.out.println("true");
            g.setColor(getBackground().darker());
        }
        else
        {
        	g.setColor(Color.cyan);
        }
//		g.fillRect(0, 0, getWidth(), getHeight());
		g.fillArc(0,0,50,50,180,-90);
        g.fillArc(34, 0, 50, 50, 0, 90);
        g.fillRect(13,0,36,13);
//		super.paintComponent(g);
	}
	
//	@Override
//	protected void paintBorder(Graphics g) {
//		
//		super.paintBorder(g);
////	  g.setColor(this.getBackground().darker());
////      g.drawArc(0, 0, 50, 50, 180, -90);
////      g.drawLine(13, 0, 73, 0);
////      g.drawArc(34, 0, 50, 50, 0, 90);
////      g.drawLine(0, 24, 84, 24);
//	}
	
}
