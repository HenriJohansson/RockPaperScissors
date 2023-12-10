
package rockpaperscissors;

/**
 * 
 * Player of the game
 * 
 * @author Henri Johansson
 * 
 */
public class Player implements IPlayer {

    private int wins;      // Number of wins
    protected ILogic rules;
    public Player() {
    	wins = 0;
    	this.rules = GameLogic.getInstance();
    }

    /**
     * Choose rock, paper, or scissors randomly.
     * @return Option which was chosen.
     */
    public Option playerChoice() {
        Option valinta = null;
        int c = (int) (Math.random() * 3);
        switch (c) {
            case 0:
                valinta = rules.getOption(RockPaperScissors.ROCK);
                break;
            case 1:
                valinta = rules.getOption(RockPaperScissors.PAPER);;
                break;
            case 2:
                valinta = rules.getOption(RockPaperScissors.SCISSORS);
                break;
        }
        return valinta;
    }
    
    /**
     * Add one win to the player's wins.
     */
    public void addWin() {
    	this.wins++;
    }

    /**
     * @return int wins
     */
    public int getWins() {
        return this.wins;
    }
}
