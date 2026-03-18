import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;



public class DayThreeTest{


	@Test
	public void testForArray(){

		int size =5;
		int [] actual = DayThree.getEmptyArray(10,11,12 , size);
		int []  expected = {10,11,12,-1,-1};

		assertArrayEquals(expected , actual);
    }


    @Test
    public void testForEmptyArray(){

        int size =2;        

        int [] actual = DayThree.getEmptyArray(10,11,12, size);

        int []  expected = {10,11};

        assertArrayEquals(expected , actual);


    }

}