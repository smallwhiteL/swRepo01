package frame.server_choice;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JRootPane;

import utils.FrameSizeUtils;
/**
 * 区服选择窗口
 * @author ASUS
 *
 */
@SuppressWarnings("serial")
public class FirstFrame extends JFrame {
		
	// 窗口宽高
	private int frameWidth;
	private int frameHeight;
	// 窗口位置
	private int startXLocation;
	private int startYLocation;
	
	// 定义四个JPanel上中下,中间的分为两部分
	private MyPanel northPanel = new MyPanel("img_folder01/bgp_north.jpg"); // 背景图路径
	private MyPanel westPanel = new MyPanel();
	private MyPanel eastPanel = new MyPanel();
	private MyPanel southPanel = new MyPanel();
	
	/**
	 * 固定参数的初始化在初始化块内进行
	 */
	{
		// 按比例获得窗口宽高,具体:宽为屏幕的1/2,高为3/4
		frameWidth = FrameSizeUtils.getFirst_frameWidth() >> 1;
		frameHeight = (FrameSizeUtils.getFirst_frameHeight() * 3) >> 2;
		
		// 设置窗口在屏幕的合适位置,具体:起始点的x为屏幕宽的1/4,高为1/6
		startXLocation = FrameSizeUtils.getFirst_startXLocation();
		startYLocation = FrameSizeUtils.getFirst_startYLocation();
	}
	
	public static void main(String[] args) {
		
		new FirstFrame().init();
	}

	/**
	 * 窗口的初始化
	 */
	public void init() {
		
		// 去掉窗口的装饰
		setUndecorated(true); 
		// 去掉标题栏，即装饰风格为NONE
		getRootPane().setWindowDecorationStyle(JRootPane.NONE);
		// 设置窗口位置与大小
		setLocation(startXLocation, startYLocation);
		setSize(frameWidth, frameHeight);
		setVisible(true);
		// 布局为绝对布局
		setLayout(null);
		
		
		/**
		 *  初始化北部的Panel
		 */
		// 宽与JFrame一样,高为1/6
		int northPanelWidth = frameWidth;
		int northPanelHeight = frameHeight / 6;
		northPanel.setSize(northPanelWidth, northPanelHeight);
		northPanel.setBackground(Color.white);
		// 加入JFrame
		add(northPanel);
		
		/**
		 *  初始化中部的Panel
		 */
		// westPanel宽为JFrame的1/3,高为JFrame的2/3
		int westPanelWidth = frameWidth / 3;
		int westPanelHeight = (frameHeight << 1) / 3;
		westPanel.setSize(westPanelWidth, westPanelHeight);
		// 内容
		westPanel.setBackground(Color.blue);
		// 设置westPanel的位置
		int west_x = 0;
		int west_y = northPanelHeight;
		westPanel.setLocation(west_x, west_y);
		
		// eastPanel宽为Frame的2/3,高为JFrame的2/3
		int eastPanelWidth = (frameWidth << 1) / 3;
		int eastPanelHeight = westPanelHeight;
		eastPanel.setSize(eastPanelWidth, eastPanelHeight);
		// 内容
		eastPanel.setBackground(Color.green);
		// eastPanel的起始位置需要设置为紧挨westPanel
		int east_x = westPanelWidth;
		int east_y = northPanelHeight;
		eastPanel.setLocation(east_x, east_y);
		// 加入JFrame
		add(westPanel);
		add(eastPanel);
		
		/**
		 *  初始化南部的Panel
		 */
		// southPanel的宽与JFrame一样,高与北部的一样
		int southPanelWidth = frameWidth;
		int southPanelHeight = northPanelHeight;
		southPanel.setSize(southPanelWidth, southPanelHeight);
		// 内容
		southPanel.setBackground(Color.red);
		// southPanel的位置需要设置为紧挨中部
		int south_x = 0;
		int south_y = northPanelHeight + eastPanelHeight;
		southPanel.setLocation(south_x, south_y);
		// 加入JFrame
		add(southPanel);
		
	}
}
