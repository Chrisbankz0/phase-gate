import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class LevelFourTasksTest {


	@Test
	public void testAddNumbers(){
		assertEquals(5, LevelFourTasks.addNumbers(2,3));
	}

	@Test
	public void testIsEvenNumber(){
		assertTrue(LevelFourTasks.isEvenNumber(4));
		assertFalse(LevelFourTasks.isEvenNumber(5));
	}

	@Test
	public void testSquareNumber(){
		assertEquals(25, LevelFourTasks.squareOfNumber(5));
	}

}

