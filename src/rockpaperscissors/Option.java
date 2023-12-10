package rockpaperscissors;
/**
 * 
 * Option represents one option in the rock-paper-scissors game.
 * 
 * @author Henri Johansson
 *
 */
public class Option {
	private RockPaperScissors currentOption;
	private RockPaperScissors wins, loses;
	/**
	 * Constructor sets the option, winning option and losing option.
	 * @param currentOption is the current option of the object.
	 * @param wins is an option that wins this option.
	 * @param loses is an option that loses to this option.
	 */
	public Option(
			RockPaperScissors currentOption
			, RockPaperScissors wins
			, RockPaperScissors loses) {
		this.currentOption = currentOption;
		this.wins = wins;
		this.loses = loses;
	}
	
	/**
	 * The current option.
	 * @return RockPaperScissors options enum.
	 */
	public RockPaperScissors getOption() {
		return currentOption;
	}
	
	/**
	 * Option that wins current option.
	 * @return RockPaperScissors winner against this current option.
	 */
	public RockPaperScissors getWins(){
		return wins;
	}
	/**
	 * Option that loses to current option.
	 * @return RockPaperScissors loser against this current option.
	 */
	public RockPaperScissors getLoses(){
		return loses;
	}
	
	/**
	 * Compares two options and returns the one that wins in the comparison.
	 * @param guest to compare with type of Option.
	 * @return the winning option or null if it's a tie type of Option.
	 */
	public Option winsTheComparison(Option guest) {
		if(this.wins.equals(guest.currentOption)) {
			return guest;
		} else if (this.loses.equals(guest.currentOption)) {
			return this;
		} else {
			return null;
		}
	}
	
	/**
	 * Compares two options and checks if they are the same.
	 * @param obj the second object to compare with.
	 * @return true if the options are the same, otherwise false.
	 */
	@Override
	public boolean equals(Object obj){
		if(obj instanceof Option) {
			Option other = (Option) obj;
			if(
					this.currentOption == other.currentOption && 
					this.loses == other.loses && 
					this.wins == other.wins) {
				return true;
			} else {
				return false;
			}
		}
		return super.equals(obj);
	}
}
