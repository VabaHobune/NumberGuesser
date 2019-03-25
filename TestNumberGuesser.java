
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;
public class TestNumberGuesser {
   @Test
   public void testIsCorrectNumberTrue() {
      assertEquals(NumberGuesser.isCorrectNumber(1), 0);
   }
   
   @Test
   public void testIsCorrectNumberFalse() {
      assertEquals(NumberGuesser.isCorrectNumber(-1), -3);
   }
   
   @Test
   public void testPlayRoundCorrect() {
	   NumberGuesser numberGuesser = new NumberGuesser(2);
	   assertEquals(0, numberGuesser.playRound(2)); 
   }
   
   @Test
   public void testPlayRoundWrongInput() {
	   NumberGuesser numberGuesser = new NumberGuesser(2);
	   assertEquals(-3, numberGuesser.playRound(-4)); 
   }
   
   @Test
   public void testPlayRoundTooBig() {
	   NumberGuesser numberGuesser = new NumberGuesser(2);
	   assertEquals(1, numberGuesser.playRound(3)); 
   }
   
   @Test
   public void testPlayRoundTooSmall() {
	   NumberGuesser numberGuesser = new NumberGuesser(2);
	   assertEquals(-1, numberGuesser.playRound(1)); 
   }
}