
public class LevelFiveTask{

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

		int[] result = new int[number.length];
		int index = 0;

		for(int num = 0; num < number.length; num++){
			if(number[num] != 0){
			result[index] = number[num];
			index++;
		}
	}

		while(index < result.length){
			result[index] = 0;
			index++;
		}

	return result;
	}

}