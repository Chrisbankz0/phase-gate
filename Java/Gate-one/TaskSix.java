import java.util.Scanner;

public class TaskSix{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);


		System.out.print("Enter the length: ");
		double length = input.nextDouble();

		System.out.print("Enter the width: ");
		double width = input.nextDouble();

	double result = length * width;

	System.out.print("The area of the rectangle is  " + result );



}

}