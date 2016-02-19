package twod.model;

import java.awt.Color;

public class GiantsWallet
{
	private int numberOfRupees;
	private Color walletColor;
	private String walletName;
	
	public GiantsWallet()
	{
		this.numberOfRupees= 500;
		this.walletColor = Color.GREEN;
		this.walletName = "Giants wallet";
	}
	
	public GiantsWallet(int numberofRupees, Color walletColor)
	{
		
	}

	public int getNumberOfRupees()
	{
		return numberOfRupees;
	}

	public void setNumberOfRupees(int numberOfRupees)
	{
		this.numberOfRupees = numberOfRupees;
	}

	public Color getWalletColor()
	{
		return walletColor;
	}

	public void setWalletColor(Color walletColor)
	{
		this.walletColor = walletColor;
	}
	
	
	public String getWalletName()
	{
		return walletName;
	}

	public void setWalletName(String walletName)
	{
		this.walletName = walletName;
	}

	public String toString()
	{
		String walletDescription = "This wallet holds " + numberOfRupees + " rupees and it's a " + walletColor + " " + walletName;
		return walletDescription;
	}
}
