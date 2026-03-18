public class DayThree{


    public static int [] getEmptyArray(int value1, int value2, int value3, int size){

         int []result = new int [size];

         int []values = {value1, value2, value3};

        for (int index = 0; index < size; index++){
        
             if (index < values.length){

                result[index] = values[index];
            
          }else{

                result[index] =-1;
    
            }

        }
        return result;
    }


	public static int maxNumber(int [] numbers){
		int max = numbers[0];

		for(int index : numbers){
			if (index > max){
				max = index;
			}
		}
		return index;
	}


    public static int countOccurrences(string[] text){
        int count = 0;

	char cha = new chatAt(text);
        for(int num : text){
            if(num == cha){
                count++;
            }
        }
        return cha, count;
    }


    public static int findIndex(int[] numbers, int target){
        for(int index = 0; index < numbers.length; index++){
            if(number[index] == target){
                return index;
            }
        }
        return index;
    }

}