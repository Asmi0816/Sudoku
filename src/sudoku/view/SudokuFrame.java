package sudoku.view;

import java.awt.Dimension;
import javax.swing.*;
import sudoku.controller.SudokuController;
import sudoku.view.SudokuPanel;

public class SudokuFrame extends JFrame
{
	private SudokuController baseController;
	private SudokuPanel basePanel;
	
	public SudokuFrame(SudokuController baseController)
	{
		super();
		this.baseController = baseController;
		basePanel = new SudokuPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setTitle("A new game you never thought possible... Sudoku!");
		this.setSize(new Dimension(1080, 800));
		this.setResizable(true);
		this.setVisible(true);
	}
}
