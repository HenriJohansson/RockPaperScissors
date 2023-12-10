package rockpaperscissors;

public class TestPlayerPaper extends Player implements IPlayer {

    public TestPlayerPaper() {
    	super();
    }
	public Option playerChoice() {
        return rules.getOption(RockPaperScissors.PAPER);
    }

}
