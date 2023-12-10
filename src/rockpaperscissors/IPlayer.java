package rockpaperscissors;
/**
 * 
 * Player template for what the player class requires
 * 
 * @author Henri Johansson
 */
public interface IPlayer {
	public abstract Option playerChoice();
    public abstract void addWin();
    public abstract int getWins();
}
