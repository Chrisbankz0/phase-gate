import java.util.Scanner;

public class Taskthirteen{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);


	System.out.print("Enter your number: ");
	int number = input.nextInt();

	if( number >= 50){
		System.out.print("Pass");
	}
	else{
		System.out.print("Fail");
	}


}

}