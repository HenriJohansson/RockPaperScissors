package rockpaperscissors;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameCounterTest {

	private GameCounter counter;
	private IPlayer playerRock, playerScissors, playerPaper;
	
	@BeforeEach
	void setUp() throws Exception{
		counter = new GameCounter();
		playerRock = new TestPlayerRock();
		playerScissors = new TestPlayerScissors();
		playerPaper = new TestPlayerPaper();
	}

	@Test
	void RoundRockWins(){
		assertEquals(playerRock, counter.playARound(playerRock, playerScissors)); 
	}
	
	@Test
	void RoundScissorsWin(){
		assertEquals(playerScissors, counter.playARound(playerScissors, playerPaper));
	}
	
	@Test
	void RoundPaperWins(){
		assertEquals(playerPaper, counter.playARound(playerPaper, playerRock));
	}
	
	@Test
	void RoundTies(){
		assertEquals(null, counter.playARound(playerRock, playerRock)); 
	}

	@Test
	void GetPlayedRounds(){
		counter.playARound(playerPaper, playerRock);
		assertEquals(1, counter.getPlayedRounds());
	}

	@Test
	void GetTiedRounds(){
		counter.playARound(playerPaper, playerRock);
		counter.playARound(playerRock, playerPaper);
		counter.playARound(playerScissors, playerScissors);
		assertEquals(1, counter.getRoundsTied());
	}

}
