package sudoku.model;
import java.util.ArrayList;


public class Game
{
	private ArrayList<String> numbersList;
	public int roundChoice;
	
	public Game()
	{
		roundChoice = 0;
		math();
	}
	
	public int math()
	{
		int random = 0;
		int min = 1;
		int max = 4;
		random = (int)(Math.random() * (max - min) + min);
		roundChoice = random;
		System.out.println(random);
		return random;
	}
}
