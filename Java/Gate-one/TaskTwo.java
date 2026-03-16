import java.util.Scanner;

public class TaskTwo{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);


	System.out.print("Enter your age: ");
	int age = input.nextInt();

	int result = age + 5;

	System.out.print("Your age will be " + result + " years old in 5 years");



}

}