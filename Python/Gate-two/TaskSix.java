import java.util.Scanner;

public class TaskSix{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int sum = 0;

	System.out.print("Enter a number: ");
	int number = input.nextInt();
	
	for(int index = 1; index <= number; index++){
		sum += number;
	}

	System.out.printf("%d", sum);


}

}