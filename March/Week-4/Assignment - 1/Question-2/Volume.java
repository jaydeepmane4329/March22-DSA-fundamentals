

public class Volume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Volume myObject = new Volume();
		int side = 4;
		int length = 5;
		int breadth = 10;
		int squareArea = myObject.areaOfShape(side);
		int rectangleArea = myObject.areaOfShape(length,breadth);
		
		System.out.println(squareArea);
		System.out.println(rectangleArea);
	}
	
	public int  areaOfShape(int side){
		return side * side;
	}
	
	public int areaOfShape(int l, int b) {
		return l * b;
	}

}
