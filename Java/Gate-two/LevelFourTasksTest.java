import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class LevelFourTasksTest {


	@Test
	public void testAddNumbers(){
		int actual = LevelFourTasks.addNumbers(2,3);
		int expected = 5;
		assertEquals(expected, actual);
		}

	@Test
	public void testThatCanAddNumbers(){
		assertEquals(7, LevelFourTasks.addNumbers(2,5));
	}

	@Test
	public void testThatSquareOfNumber(){
		int actual = LevelFourTasks.squareOfNumber(4);
		int expected = 16;
	
		assertEquals(expected,actual);
	}

	@Test
	public void testIsEvenNumber(){

		boolean actual = LevelFourTasks.isEvenNumber(4);
		boolean expected = true;
		assertEquals(expected,actual);
	}

	@Test
	public void testSquareNumber(){
		assertEquals(25, LevelFourTasks.squareOfNumber(5));
	}

	@Test
	public void testIsPrimeNumber(){
		boolean actual = LevelFourTasks.isPrimeNumber(7);
		boolean expected = true;

		assertEquals(expected, actual);

	}


	@Test
	public void testThatIsNotPrimeNumber(){
		boolean actual = LevelFourTasks.isPrimeNumber(10);
		boolean expected = false;

		assertEquals(expected, actual);

	}


	@Test
	public void testThatcalculateSimpleInterest(){
		double actual = LevelFourTasks.calculateSimpleInterest(1000,5,2);
		int expected = 100;

		assertEquals(expected, actual);
	}

}

