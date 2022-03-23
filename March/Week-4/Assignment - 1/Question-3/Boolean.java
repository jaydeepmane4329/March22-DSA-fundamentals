

public class Boolean {

	public static void main(String[] args) {
        Boolean myObject = new Boolean();
		int digit = 5;
		
		boolean result = myObject.getTrueFalse(digit);
		System.out.println(result);
		
	}
	
	public boolean getTrueFalse(int digit) {
		if(digit == 5) {
			return true;
		}else {
			return false;
		}
	}

}
