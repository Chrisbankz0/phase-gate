import java.util.Scanner;

public class TaskTwelve{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);


	System.out.print("Enter your number: ");
	int number = input.nextInt();

	if( number > 0){
		System.out.print("Number is positive");
	}
	else if (number < 0){
		System.out.print("Number is Negative");
	}
	else{
		System.out.print("Number is 0");

	}


}

}