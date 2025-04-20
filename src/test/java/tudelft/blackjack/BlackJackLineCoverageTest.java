package tudelft.blackjack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BlackJackLineCoverageTest {

 //   Segun el ejercicio1, solo se tiene que comentar y ver el testing otra vez con coverage

 //   @Test
  //  public void bothPlayersGoTooHigh() {
   //     int result = new BlackJack().play(30, 30);
   //     Assertions.assertEquals(0, result);
   // }

    @Test
    public void leftPlayerWins() {
        int result = new BlackJack().play(10, 9);
        Assertions.assertEquals(10, result);
    }
}
