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
	
	public SudokuPanel(SudokuController baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		
		this.sudokuTable = new JTable();
		
	}
	
	
	
	
	
}
