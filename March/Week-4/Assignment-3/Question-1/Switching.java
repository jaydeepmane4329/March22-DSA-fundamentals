package java_assignments;

import java.util.Scanner;
public class Switching {

	public static void main(String[] args) {
	
       Scanner scan = new Scanner(System.in);
       
       int marks = scan.nextInt();
       if(marks > 80) {
    	   marks = 1;
       }else {
    	   marks  = 2;
       }
       switch(marks){
       case 1:
    	   System.out.println("Grade A");
    	   break;
       case 2:	   
    	   System.out.println("Grade B");
    	   break;
       }
     
 
       
	}

}
