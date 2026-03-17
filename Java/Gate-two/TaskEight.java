import java.util.Scanner;

public class TaskEight{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int total = 0;

	while (true){
		System.out.print("Enter a number: ");
		int number = input.nextInt();

		if (number == 0){
			break;
		}
		total += number;
	
	}

	System.out.printf("%d", total);


}

}