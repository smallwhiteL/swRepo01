package frame.server_choice;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;
/**
 * 北部面板类
 * @author ASUS
 *
 */
@SuppressWarnings("serial")
public class MyPanel extends JPanel {
	private Image img = null;
	/**
	 * 设置背景图的构造方法
	 * @param img_path
	 */
	public MyPanel(String img_path) {
		img = Toolkit.getDefaultToolkit().getImage(img_path);
	}

	public MyPanel() {
		super();
	}


	// 固定背景图片，允许这个JPanel可以在图片上添加其他组件
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	}
	
}
