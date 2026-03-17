import java.util.Scanner;

public class TaskTen{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int count = 0;

	System.out.print("Enter a number: ");
	String number = input.nextLine();
	
	for(int index = 1; index <= number.length(); index++){
		count += 1;
	}
	System.out.print(count);


}

}