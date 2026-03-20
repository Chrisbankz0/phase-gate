import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;



public class LevelSixTaskTest{


	@Test
	public void testPalindromeFalse() (){

		int[] expected = False;
		int[] actual = LevelSixTask.isPalindrome({1, 2, 3, 4});
		assertArrayEquals(expected, actual);

	}