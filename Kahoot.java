import java.util.Scanner;

public class Kahoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scnr = new Scanner(System.in);
int age = 0;
System.out.print("Enter your age: ");
age = scnr.nextInt();
System.out.print("You may be able to retire ");
System.out.println("in" + (65 - age) + "years");
	}

}
