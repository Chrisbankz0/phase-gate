import java.util.Scanner;

public class TaskEighteen{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter the days (1-7): ");
	int day = input.nextInt();

	if( day == 1){
		System.out.print("Monday");
	}
	else if (day == 2){
		System.out.print("Tuesday");
	}
	else if (day == 3){
		System.out.print("wednesday");
	}
	else if (day == 4){
		System.out.print("thursday");
	}
	else if (day == 5){
		System.out.print("friday");
	}
	else if (day == 6){
		System.out.print("saturday");
	}
	else if (day == 7){
		System.out.print("sunday");
	}
	else {
		System.out.print("incorrect day of the week");
	}


}

}