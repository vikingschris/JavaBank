import javax.swing.JOptionPane;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;


public class HelloWorld{
	private String ShipperName;
	private int ShipperID;
	
	public HelloWorld(String ShipperName,int ShipperID)
	{
		this.ShipperName = ShipperName;
		this.ShipperID = ShipperID;
	}
	public HelloWorld()
	{
		ShipperName = "";
		ShipperID = 0;
	}
	public String getShipperName()
	{
		return ShipperName;
	}
	public int getShipperID()
	{
		return ShipperID;
	}
	public void setShipperName(String aName)
	{
		ShipperName = aName;
	}
	public void setShipperID(int aID)
	{
		ShipperID = aID;
	}
	public int rec(int n)
	{
		if(n == 1)
		{
			return 1;
		}
		else
		{
			return n + rec(n-1);
		}
	}


}
