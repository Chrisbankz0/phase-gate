public class LevelSixTask{

	public static boolean isPalindrome(int[] number) {
	int[] reversed = new int[number.length];

	for (int index = 0; index < number.length; index++) {
		reversed[index] = number[number.length - 1 - index];
	}

	for (int index = 0; index < number.length; index++) {
		if (arr[index] != reversed[index]) {
			return false;
		}
	}

	return true;

	}

}