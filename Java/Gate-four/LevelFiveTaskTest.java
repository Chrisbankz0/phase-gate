import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;



public class LevelFiveTaskTest{


	@Test
	public void testForReplaceNegativeNumber(){

		int[] expected = {5,0,3,0};
		int[] actual = LevelFiveTask.replaceNegativeNumber(new int[]{5,-9,3,-6});
		assertArrayEquals(expected, actual);

	}

	@Test
	public void testForReplaceNegativeNumberAgain(){

		int[] expected = {5,0,3,0,5};
		int[] actual = LevelFiveTask.replaceNegativeNumber(new int[]{5,-9,3,-6,5});
		assertArrayEquals(expected, actual);

	}


	@Test
	public void testMoveZeros() {

		int[] expected = {5,3,2,0,0};
		int[] actual = LevelFiveTask.moveZerosBehind(new int[]{5,0,3,0,2});
		assertArrayEquals(expected, actual);
	}

	@Test
	public void testMoveZerosAgain() {

		int[] expected = {5,3,2,4,0,0};
		int[] actual = LevelFiveTask.moveZerosBehind(new int[]{5,0,3,0,2,4});
		assertArrayEquals(expected, actual);
	}
}