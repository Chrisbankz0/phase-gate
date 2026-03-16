import java.util.Scanner;

public class TaskFour{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);


	int result = 1;
	
	for( int index = 1; index <= 2; index++){ 
		System.out.print("Enter number : ");
		int number = input.nextInt();
		result *= number;
	}

	System.out.print("The sum of the 2 numbers is  " + result );



}

}