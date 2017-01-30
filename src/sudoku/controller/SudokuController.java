package sudoku.controller;
import sudoku.model.Game;
import sudoku.view.SudokuFrame;
import sudoku.view.SudokuPanel;



public class SudokuController
{
	
	private Game newGame;
	private SudokuFrame baseFrame;
	
	public SudokuController()
	{
		newGame = new Game();
		baseFrame = new SudokuFrame(this);
		
	}
	public void start()
	{
		
	}
	
 
}
