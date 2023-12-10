package rockpaperscissors;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OptionTest {
	Option rock, scissors, paper, rocket;
	@BeforeEach
	void setUp() throws Exception{
		this.rock = new Option(
				RockPaperScissors.ROCK, 
				RockPaperScissors.PAPER, 
				RockPaperScissors.SCISSORS);
		this.paper = new Option(
				RockPaperScissors.PAPER, 
				RockPaperScissors.SCISSORS, 
				RockPaperScissors.ROCK);
		this.scissors = new Option(
				RockPaperScissors.SCISSORS, 
				RockPaperScissors.ROCK, 
				RockPaperScissors.PAPER);
		this.rocket = new Option(
				RockPaperScissors.ROCK,
				RockPaperScissors.PAPER,
				null);
	}

	@Test
	void sameKindMatch() {
		Option kivi2 = new Option(
				RockPaperScissors.ROCK, 
				RockPaperScissors.PAPER, 
				RockPaperScissors.SCISSORS);
		assertEquals(rock, kivi2);
	}
	@Test 
	void differentKindsDontMatch() {
		Option erilainenKivi = new Option(
				RockPaperScissors.ROCK, 
				RockPaperScissors.ROCK, 
				RockPaperScissors.ROCK);
		assertNotEquals(rock, erilainenKivi);
	}
	

}
