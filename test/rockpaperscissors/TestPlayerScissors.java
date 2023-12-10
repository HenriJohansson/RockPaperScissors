package rockpaperscissors;

public class TestPlayerScissors extends Player implements IPlayer {

    public TestPlayerScissors() {
    	super();
    }
	public Option playerChoice() {
        return rules.getOption(RockPaperScissors.SCISSORS);
    }

}
