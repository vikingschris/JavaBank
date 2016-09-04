import javax.swing.JOptionPane;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;


public class Child extends HelloWorld{
	private int OrderID;
	
	public Child(String sName,int sID,int OrderID)
	{
		super(sName,sID);
		this.OrderID = OrderID;
	}
	public Child()
	{
		super();
	}
	public int getOrderID()
	{
		return OrderID;
	}
	public void setOrderID(int oID)
	{
		OrderID = oID;
	}
	

}
