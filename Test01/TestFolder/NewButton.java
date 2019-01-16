package packagethree;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class NewButton extends JButton {
	
	private int width;
	private int height;
	
	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
//		if (getModel().isPressed()) // 点击时
//        {
//            g2d.setColor(Color.gray);
//        }
//		else
//        {
//			if(getModel().isRollover()) {  // 鼠标移到按钮上时
//				g2d.setColor(Color.green);
//			}
//			else {
//				g2d.setColor(Color.cyan);
//			}
//        }
		g2d.setColor(new Color(190, 34, 70));
		width = getWidth();
		height = getHeight();
//		System.out.println(width); // 150
//		g2d.fillArc(0, 0, getWidth(), getHeight(), 0, 360);
		//==================外圆
		int x = -(width / 12);
		int y = -(width / 12);
		int w = width-1 - 2*x;
		int h = height-1 - 2*y;
		g2d.fillArc(x, y, w, h, 0, 360); 
		//==================两个内矩形
		g2d.fillRect(0, height >> 1, (width-1) >> 1 , (height-1) >> 1); // 左下
		g2d.fillRect(width >> 1, 0, (width-1) >> 1, (height-1) >> 1 ); // 右上
	}
	
}
