package rockpaperscissors;

public class TestPlayerRock extends Player implements IPlayer {

    public TestPlayerRock() {
    	super();
    }
	public Option playerChoice() {
        return rules.getOption(RockPaperScissors.ROCK);
    }

}
