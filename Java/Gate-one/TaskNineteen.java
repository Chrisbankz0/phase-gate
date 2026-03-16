import java.util.Scanner;

public class TaskNineteen{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);


	System.out.print("Enter your age: ");
	int number = input.nextInt();

	if( number > 0 && number <= 12){
		System.out.print("child");
	}
	else if( number >= 13 && number <= 20){
		System.out.print("Teenager");
	}
	else if( number >= 20){
		System.out.print("Adult");
	}
	else{
		System.out.print("invalid age");
	}


}

}