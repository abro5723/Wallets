package twod.view;

import javax.swing.*;
import twod.controller.TwoDController;

public class TwoDFrame
{
	private TwoDController baseController;
	
	public TwoDFrame(TwoDController baseController)
	{
		this.baseController = baseController;
		baseController = new TwoDController();
	}

}
