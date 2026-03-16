import java.util.Scanner;

public class TaskFourteen{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int largest = "";

	for (int index = 1; index <= 2; index++){

		System.out.print("Enter your number: ");
		int number = input.nextInt();

		if (number > largest){
			number = largest;
		}
	}
	System.out.print(largest);


}

}