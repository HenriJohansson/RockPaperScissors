package rockpaperscissors;

/**
 * Game of Rock Paper Scissors
 * @author Henri Johansson
 */
public class Game {
	/**
	 * Main method where the game starts executing.
	 * @param args
	 */
    public static void main(String args[]) {
       IPlayer p1 = new Player();
       IPlayer p2 = new Player();
       boolean gameEnded = false;
       GameCounter gameCounter = new GameCounter();
        
       do {
           IPlayer p1or2 = gameCounter.playARound(p1, p2);
           if(p1or2 != null) {
        	   p1or2.addWin();
           }
           if ((p1.getWins() >= 3) || (p2.getWins() >= 3)) {
               gameEnded = true;
               System.out.println("THREE VICTORIES - GAME ENDS");
           }
           System.out.println();
       } while (gameEnded != true);
    }
}
