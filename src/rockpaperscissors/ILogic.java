package rockpaperscissors;
/**
 * 
 * GameLogic template for gamelogic.
 * @author Henri Johansson
 *
 */
public interface ILogic {
	public abstract int determineVictor(Option option1, Option option2);
	public abstract Option getOption(RockPaperScissors option);
}
