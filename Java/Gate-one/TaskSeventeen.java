import java.util.Scanner;

public class TaskSeventeen {
public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	String password = "";

	while (!password.equals("admin123")){
		System.out.print("Enter your password: ");
		password = input.nextLine();
        }

	System.out.println("Access Granted");

    }
}