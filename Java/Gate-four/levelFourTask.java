import java.util.*;

public class LevelFourTask{

	public static int[] replaceNegativeNumber(int[] number){

		int [] result = new int[number.length];

		for(int index = 0; index < number.length; index++){

			if (number[index] < 0){
				result[index] = 0;
			}
			else{
				result[index] = number[index];
			}
		}
		return result;
	}


	public static int[] moveZerosBehind(int[] number){

		int [] result = new int[number.length];

		for(int index = 0; index < number.length; index++){

			result[index] = number[index];

			if (number[index] < 0){
				result[index] = 0;
			}
		}
		return result;
	}

}