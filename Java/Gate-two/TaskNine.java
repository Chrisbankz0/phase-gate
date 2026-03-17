import java.util.Scanner;

public class TaskNine{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int sum = 0;
	
	for(int index = 1; index <= 5; index++){
		for(int count = 1; count <= index; count++){
			System.out.print("*");
		}
		System.out.println();
	}


}

}