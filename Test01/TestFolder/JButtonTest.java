package packagethree;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class JButtonTest extends JFrame {
	
	
	
	public JButtonTest(String title) throws HeadlessException {
		super(title);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private MyButton button = new MyButton();
//	private NewButton button1 = new NewButton("叶子雏形按钮");// 重绘按钮后标题失效
	public static NewButton button1 = new NewButton();
	
	public void init() {
//		button.setText("按钮");
		setBounds(700, 300, 400, 400);
		setLayout(null);
		button.setBounds(120, 85, 150, 150);
//		button.setLocation(120, 85);
//		button.setForeground(Color.RED);  // 前景色,即字体颜色
//		button.setBorderPainted(false); // 外边框是否绘制
//		button.setFocusPainted(false); // 是否能够获得鼠标焦点
//		button.setContentAreaFilled(false); // 按钮设置为透明
		add(button);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void init1() {
		setBounds(700, 300, 400, 400);
		setLayout(null);
		button1.setBounds(120, 85, 150, 150);
		button1.setBorderPainted(false); // 外边框是否绘制
		button1.setContentAreaFilled(false); // 按钮设置为透明
		add(button1);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		JButtonTest buttonTest = new JButtonTest("JButtonTest");
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				buttonTest.setExtendedState(JFrame.ICONIFIED); // 最小化窗口
//				buttonTest.dispose();  // 关闭窗口
			}
		});
		buttonTest.init1();
	}
}
