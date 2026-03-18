public class LevelFourTasks{

	public static int addNumbers(int numberOne, int numberTwo){

	return numberOne + numberTwo;
	}

	public static boolean isEvenNumber(int number){
		return number % 2 == 0;
	}

	public static int squareOfNumber(int number){
		return number * number;
	}

	public static double celsiusToFahrenheit(double number){
		return (number * 9.0 /5) + 32;
	}

	public static boolean isPrimeNumber(int number){
		if(number <= 1){
			return false;
		}
		for(int index = 2; index < number; index++){
			if(number % index == 0){
				return false;
			}
		}
		return true;
	}

	public static int calculateSimpleInterest(int amount, int rate, int time){

		int result = (amount * rate * time) / 100;
		return result;
	}



}