import java.util.Scanner;

public class TaskNine{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);


	System.out.print("Enter the price of the item: ");
	double number = input.nextDouble();

	double discount = number * 0.10;
	double result = discount + number;


	System.out.print("The new price is: " + result );



}

}