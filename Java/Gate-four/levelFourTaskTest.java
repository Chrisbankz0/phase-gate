import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;



public class LevelFourTaskTest{


	@Test
	public void testForReplaceNegativeNumber(){

	int[] expected = {5,0,3,0};
	int[] actual = LevelFourTask.replaceNegativeNumber(new int[]{5,-9,3,-6});
	assertArrayEquals(expected, actual);


    }
}