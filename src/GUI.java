import javax.swing.JOptionPane;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class GUI extends JPanel{
	
	public void dialogBox()
	{
		String input = JOptionPane.showInputDialog("Enter: ");
		double num = Integer.parseInt(input);
		JOptionPane.showMessageDialog(null,"Num: " + num);
	}
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D.Double e1 = new Ellipse2D.Double(80, 80, 80, 80);
		g2.draw(e1);
		g2.setColor(Color.cyan);
		g2.fill(e1);
		
		Line2D.Double line = new Line2D.Double(30, 30, 60, 30);
		g2.draw(line);
		g2.setColor(Color.orange);
		g2.fill(line);
	}

}
