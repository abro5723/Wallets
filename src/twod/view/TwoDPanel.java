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
		
		
		
		setupTable();
		setupPanel();
	}
	
	private void setupTable()
	{
		String [] columnHeaders = {"Column 0", "Column 1", "Column 2"} ;
		DefaultTableModel tableModel = new DefaultTableModel(baseController.getMyWallet(), columnHeaders);
		walletTable = new JTable(tableModel);
	}
	
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(walletTable);
		this.add(currentRupees);
		this.add(columnField);
		this.add(rowField);
		
	}
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, currentRupees, 62, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, currentRupees, 0, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, columnField, -6, SpringLayout.NORTH, currentRupees);
		baseLayout.putConstraint(SpringLayout.WEST, columnField, 63, SpringLayout.EAST, currentRupees);
		baseLayout.putConstraint(SpringLayout.NORTH, walletTable, 31, SpringLayout.SOUTH, rowField);
		baseLayout.putConstraint(SpringLayout.WEST, walletTable, 0, SpringLayout.WEST, currentRupees);
		baseLayout.putConstraint(SpringLayout.NORTH, rowField, 6, SpringLayout.SOUTH, columnField);
		baseLayout.putConstraint(SpringLayout.EAST, rowField, 0, SpringLayout.EAST, columnField);
	}
	
	private void setupListeners()
	{
		
	}

}
