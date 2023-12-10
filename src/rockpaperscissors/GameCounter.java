package rockpaperscissors;

/**
 * 
 * GameCounter is used to count the rounds of the game and keeps track of the number of roundsTied
 * 
 * @author Henri Johansson
 * 
 */
public class GameCounter {
	protected ILogic rules;
	private int playedRounds = 0;           // amount of played rounds
    private int roundsTied = 0;              // amount of tied rounds
    public GameCounter() {
    	rules = GameLogic.getInstance();
	}
    /**
     * Play a round and determine which player wins.
     * @param p1 type of IPlayer player one
     * @param p2 type of IPlayer player two
     * @return the player that won type of IPlayer
     */
	public IPlayer playARound(IPlayer p1, IPlayer p2) {
		playedRounds++;
		int tulos = rules.determineVictor(p1.playerChoice(), p2.playerChoice());
		switch(tulos) {
		case 1:
			System.out.println("Player 1 wins");
			return p1;
		case -1: 
			System.out.println("Player 2 wins");
			return p2;
		default: 
			System.out.println("\n\t\t\t Tie \n");
			roundsTied++;
			return null;
		}
	}
	/**
	 * 
	 * @return int played rounds
	 */
	public int getPlayedRounds(){
		return playedRounds;
	}
	/**
	 * 
	 * @return int played rounds that Tied
	 */
	public int getRoundsTied(){
		return roundsTied;
	}
}
