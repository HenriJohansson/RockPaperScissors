package rockpaperscissors;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LogicTest {
	private ILogic logic = GameLogic.getInstance();
	@BeforeEach
	void setUp() throws Exception{
		this.logic = GameLogic.getInstance();
	}

	@Test
	void GetInstance(){
		assertEquals(logic, GameLogic.getInstance());
	}

	@Test
	void rockWins(){
		assertEquals(1, this.logic.determineVictor(
				logic.getOption(RockPaperScissors.ROCK), 
				logic.getOption(RockPaperScissors.SCISSORS)));
	}
	@Test
	void paperLoses(){
		assertEquals(-1, this.logic.determineVictor(
				logic.getOption(RockPaperScissors.PAPER), 
				logic.getOption(RockPaperScissors.SCISSORS)));
	}
	@Test
	void Tie(){
		assertEquals(0, this.logic.determineVictor(
				logic.getOption(RockPaperScissors.ROCK), 
				logic.getOption(RockPaperScissors.ROCK)));
	}

	@Test
	void GetOption(){
		assertEquals(
				new Option(RockPaperScissors.ROCK, RockPaperScissors.PAPER, RockPaperScissors.SCISSORS),
				logic.getOption(RockPaperScissors.ROCK));
	}

}
