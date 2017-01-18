package sudoku.view;


import java.awt.Color;
import javax.swing.*;
import javax.swing.border.MatteBorder;

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
		this.sudokuTable = new JTable(9, 9);
		sudokuTable.setRowHeight(sudokuTable.getRowHeight() + 24);
		this.baseLayout = new SpringLayout();
		this.holderPane = new JScrollPane(sudokuTable);
	
	
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.GRAY);
		this.add(holderPane);
		
		
	}
	
	private void setupLayout()
	{
		
		sudokuTable.setBackground(Color.BLACK);
		

	}
	
	public void setupListeners()
	{
		
	}
}
