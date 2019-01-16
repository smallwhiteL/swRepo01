package packagethree;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.net.*;

public class RoundButton
    extends JButton
{

    public RoundButton(String label)
    {
        super(label);
        Dimension size = getPreferredSize();
        setPreferredSize(size);
        setContentAreaFilled(false);
    }

    protected void paintComponent(Graphics g)
    {
//        System.out.println("paint componet");
        if (getModel().isArmed())
        {
//            System.out.println("true");
            g.setColor(getBackground().darker());
        }
        else
        {
            g.setColor(getBackground());
        }

        int w = getSize().width; // 86
        int h = getSize().height; // 26
        int d = 50;
        int r = d / 2; // 13

//        System.out.println("w = "+ w + ", h = " + h);
        
        g.fillArc(0,0,d,d,180,-90);
        g.fillArc(w - d - 2, 0, d, d, 0, 90);
        g.fillRect(r,0,w-d,r);
//        g.fillRect(0,r,w,h-r);
        // This call will paint the label and the focus rectangle.
        super.paintComponent(g);
    }

    protected void paintBorder(Graphics g)
    {
        int w = getSize().width;
        int h = getSize().height;
        int d = 50;
        int r = d / 2; // 13

//        g.setColor(this.getBackground().brighter());
//        g.drawLine(1, r, 1, h);
//        g.drawArc(1, 1, d, d, 180, -90);
//        g.drawLine(r, 1, w - r, 1);
//        g.drawArc(w - d - 1, 1, d, d, 0, 90);
//        g.drawLine(w - 1, r, w - 1, h);
//        g.drawLine(0, h - 1, w - 1, h - 1);

        g.setColor(this.getBackground().darker());
//        g.drawLine(0, r, 0, h - 2);
        g.drawArc(0, 0, d, d, 180, -90);
        g.drawLine(r, 0, w - r, 0);
        g.drawArc(w - d - 2, 0, d, d, 0, 90);
//        g.drawLine(w - 2, r, w - 2, h - 2);
        g.drawLine(0, h - 2, w - 2, h - 2);
    }


    public static void main(String[] args)
    {
        JButton button = new RoundButton("圆形按钮");

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setTitle("round button");
        frame.getContentPane().setLayout(new FlowLayout());
        frame.setSize(300, 200);
        frame.setVisible(true);
//        frame.setTitle("123");

    }



//    // Hit detection.
//    Shape shape;
//    public boolean contains(int x, int y)
//    {
//        System.out.println("contains");
//        // If the button has changed size, make a new shape object.
//        if (shape == null || !shape.getBounds().equals(getBounds()))
//        {
//            shape = new Ellipse2D.Float(0, 0, getWidth(), getHeight());
//        }
//        return shape.contains(x, y);
//    }

}