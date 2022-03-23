

public class MathOperation {

	public static void main(String[] args) {
		
		MathOperation myObject = new MathOperation();
		int a = 5;
		int b = 6;
		
		myObject.sum(a, b);
		myObject.diffrence(a,b);
	}
   
	public void sum(int a, int b) {
		int addition = a + b;
		System.out.println("addition is = " + addition);
	}
	
	public void diffrence(int a , int b) {
		int diff;  
		if(a > b) {
			 diff = a - b;
		}else {
			 diff = b - a;
		}
		System.out.println("difrrence is = " +diff);
	}
}
