package twod.controller;

import java.awt.Color;

import twod.model.GiantsWallet;
import twod.view.TwoDFrame;

public class TwoDController
{
	private TwoDFrame baseFrame;
	private GiantsWallet [][] myWallet;
	
	public TwoDController()
	{
		myWallet = new GiantsWallet[3][3];	
		setupArray();
		baseFrame = new TwoDFrame(this);
	}
	
	public void start()
	{

	}
	
	private void setupArray()
	{
		for(int row = 0; row < myWallet.length; row++)
		{
			for(int col = 0; col < myWallet[0].length; col++)
			{
				myWallet[row][col] = new GiantsWallet();
				if(col% 2 == 0)
				{
					myWallet[row][col].setNumberOfRupees(col + 5);
				}
				else
				{
					myWallet[row][col].setWalletColor(Color.GREEN);
				}
			}
		}
	}
	
	public GiantsWallet [][] getMyWallet()
	{
		return myWallet;
	}

}
