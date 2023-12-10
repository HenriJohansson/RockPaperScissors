package rockpaperscissors;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlayerTest {

	private Player tester;

	@BeforeEach
	void setUp() throws Exception{
		tester = new Player();
	}

	@Test
	void noWins(){
		assertEquals(0, tester.getWins());
	}
	@Test
	void hundredWins(){
		for (int i = 0; i < 100; i++){
			tester.addWin();	
		}
		assertEquals(100, tester.getWins());
	}
	@Test
	void oneWin(){
		tester.addWin();
		assertEquals(1, tester.getWins());
	}

}
