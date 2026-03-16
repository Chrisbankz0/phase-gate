import java.util.Scanner;

public class TaskTen{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);


	int result = 0;
	
	for( int index = 1; index <= 3; index++){ 
		System.out.print("Enter number : ");
		int number = input.nextInt();
		result += number;
	}

	double calculated = result / 3;

	System.out.print("The average of the 3 numbers is  " + calculated );



}

}