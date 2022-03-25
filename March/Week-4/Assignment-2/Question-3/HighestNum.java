package java_assignments;

public class HighestNum {

	public static void main(String[] args) {

       int num1 = 10;
       int num2 = 20;
       int num3 = 30;
       
       if(num1 > num2 && num1 > num3) {
    	   System.out.println("HHighest Number is" + num1);
       }else if(num2 > num1 && num2 > num3) {
    	   System.out.println("Highest Number is" + num2);
       }else {
    	   System.out.println("Highest number is " + num3);
       }

	}

}
