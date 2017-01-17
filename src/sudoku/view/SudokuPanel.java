package sudoku.view;


import java.awt.Color;
import javax.swing.*;
import sudoku.controller.SudokuController;
import java.awt.Dimension;
import java.awt.event.*;


public class SudokuPanel extends JPanel
{
	private SudokuController baseController;
	private JTable sudokuTable;
	private SpringLayout baseLayout;
	private JScrollPane holderPane;
	
	public SudokuPanel(SudokuController baseController)
	{
		
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.holderPane = new JScrollPane();
	
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.GRAY);
		this.add(holderPane);
		JScrollPane scrollPane = new JScrollPane();
		sudokuTable = new JTable(9, 9);
		
	
		
		
	}
	
	private void setupLayout()
	{
		
	
	}
	
	public void setupListeners()
	{
		
	}
}
