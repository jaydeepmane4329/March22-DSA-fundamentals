package java_assignments;

import java.util.Scanner;
public class Conditional {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int marks = scan.nextInt();
		if(marks > 50) {
			System.out.println("pass");
		}else {
			System.out.println("Fail");
		}

	}

}
