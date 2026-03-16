import java.util.Scanner;

public class TaskEleven{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);


	System.out.print("Enter your number: ");
	int number = input.nextInt();

	if( number % 2 == 0){
		System.out.print("Number is even");
	}
	else{
		System.out.print("Number is Odd");

	}



}

}