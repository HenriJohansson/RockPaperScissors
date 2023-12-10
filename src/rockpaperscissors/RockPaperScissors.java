package rockpaperscissors;

/**
 * 
 * RockPaperScissors enum keeps hold of the options used in the game
 * 
 * @author Henri Johansson
 */
public enum RockPaperScissors {
	
	ROCK("Kivi"), SCISSORS("Sakset"), PAPER("Paperi");
	
	private String name;
	/**
	 * Created enum with name
	 * @param String name
	 */
	private RockPaperScissors(String nimi) {
		this.name = nimi;
	}
	/**
	 * @return enum String name
	 */
	public String getName(){
		return name;
	}
}
