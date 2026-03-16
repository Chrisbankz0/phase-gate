import java.util.Scanner;

public class TaskSeventeen{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter your password: ");
	int password = input.nextInt();

	if( password == admin123){
		System.out.print("correct");
	}
	else{
		System.out.print("incorrect");
	}


}

}