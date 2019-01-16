package utils;

import java.awt.Dimension;
import java.awt.Toolkit;
/**
 * 获得相应屏幕参数
 * @author ASUS
 *
 */
public class FrameSizeUtils {
	
	// 屏幕尺寸相关参数
	private static Dimension First_screenSize; // 屏幕尺寸
	private static int First_frameWidth; // 屏幕宽度
	private static int First_frameHeight; // 屏幕高度
	
	// FirstFrame的起始点位置
	private static int First_startXLocation;
	private static int First_startYLocation;
	
	static {
		// 通过屏幕尺寸获得屏幕宽高
		First_screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		First_frameWidth = First_screenSize.width;
		First_frameHeight = First_screenSize.height;
		
		// 设置第一个窗口在屏幕的合适位置,具体:起始点的x为屏幕宽的1/4,高为1/6
		First_startXLocation = First_frameWidth >> 2;
		First_startYLocation = First_frameHeight / 6;
	}

	public static int getFirst_frameWidth() {
		return First_frameWidth;
	}

	public static int getFirst_frameHeight() {
		return First_frameHeight;
	}

	public static int getFirst_startXLocation() {
		return First_startXLocation;
	}

	public static int getFirst_startYLocation() {
		return First_startYLocation;
	}
	
}
