package twod.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.table.DefaultTableModel;

import twod.controller.TwoDController;

public class TwoDPanel extends JPanel
{
	private SpringLayout baseLayout;
	private JTextField rowField;
	private JTextField columnField;
	private JLabel currentRupees;
	private JTextField editField;
	private JButton changeButton;
	private JButton displayButton;
	private JTable walletTable;
	private TwoDController baseController;
	
	public TwoDPanel(TwoDController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		
		rowField = new JTextField(5);
		columnField = new JTextField(5);
		
		editField = new JTextField(20);
		
		currentRupees = new JLabel("The current # of Rupees");
		
		changeButton = new JButton("Change the # of Rupees");
		
		displayButton = new JButton("Show the # of Rupees");
		
		
		setupLayout();
		setupTable();
		setupPanel();
	}
	
	private void setupTable()
	{
		String [] columnHeaders = {"Column 0", "Column 1", "Column 2"} ;
		DefaultTableModel tableModel = new DefaultTableModel(baseController.getMyWallet(), columnHeaders);
		walletTable = new JTable(tableModel);
		
		baseLayout.putConstraint(SpringLayout.NORTH, walletTable, 50, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, walletTable, 50, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, walletTable, 50, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, walletTable, -50, SpringLayout.EAST, this);
	}
	
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(walletTable);
		this.add(currentRupees);
		this.add(columnField);
		this.add(rowField);
		this.add(editField);
		this.add(changeButton);
		this.add(displayButton);
		
	}
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, rowField, 0, SpringLayout.NORTH, columnField);
		baseLayout.putConstraint(SpringLayout.WEST, rowField, 21, SpringLayout.EAST, columnField);
		baseLayout.putConstraint(SpringLayout.WEST, columnField, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, columnField, -67, SpringLayout.NORTH, editField);
		baseLayout.putConstraint(SpringLayout.WEST, editField, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, editField, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, currentRupees, 0, SpringLayout.WEST, columnField);
		baseLayout.putConstraint(SpringLayout.NORTH, changeButton, 1, SpringLayout.NORTH, columnField);
		baseLayout.putConstraint(SpringLayout.EAST, changeButton, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, currentRupees, 5, SpringLayout.NORTH, displayButton);
		baseLayout.putConstraint(SpringLayout.NORTH, displayButton, 15, SpringLayout.SOUTH, changeButton);
		baseLayout.putConstraint(SpringLayout.WEST, displayButton, 0, SpringLayout.WEST, changeButton);
	}
	
	private void setupListeners()
	{
		
	}

}
