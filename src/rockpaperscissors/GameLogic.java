package rockpaperscissors;
/**
 * 
 * GameLogic class determines the gamelogic for a game.
 * There can be only one set of rules in circulation at ones
 * so this class is a Singleton
 * 
 * @author Henri Johansson
 *
 */
public class GameLogic implements ILogic {
	
	private Option rock, paper, scissors; // Available options
	
	private static final GameLogic instance = new GameLogic();
	
	/**
	 * Let's build the gamerules directly in the GameLogic constructor.
	 */
	private GameLogic() {
		this.rock = new Option(
				RockPaperScissors.ROCK, 
				RockPaperScissors.PAPER, 
				RockPaperScissors.SCISSORS);
		this.paper = new Option(
				RockPaperScissors.PAPER, 
				RockPaperScissors.SCISSORS, 
				RockPaperScissors.ROCK);
		this.scissors = new Option(
				RockPaperScissors.SCISSORS, 
				RockPaperScissors.ROCK, 
				RockPaperScissors.PAPER);
	}
	public static GameLogic getInstance() {
		return instance;
	}
	
	/**
	 * Determine the winner between two players.
	 * @param option1 type Option
	 * @param option2 type Option
	 * @return int: 1 for victory, 0 for a tie, -1 for defeat
	 */
	public int determineVictor(Option option1, Option option2) {
		if(option1.winsTheComparison(option2) == null) {
			return 0;
		}
		if(option1.winsTheComparison(option2).equals(option1)) {
			return 1;
		} else if (option1.winsTheComparison(option2).equals(option2)) {
			return -1;
		}
		return 0;
	}
	/**
	 * Request rock, scissors, or paper according to the gamerules.
	 * @return Option rock, scissors, or paper
	 */
	public Option getOption(RockPaperScissors vaihtoehto){
		switch(vaihtoehto){
		case ROCK:
			return rock;
		case SCISSORS:
			return scissors;
		case PAPER:
			return paper;
		default:
			return rock;
		}
	}
}
