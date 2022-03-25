package java_assignments;
import java.util.Scanner;
public class EvenArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int arr[] = new int[10];
		int j = 0;
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				arr[j] = i;
				j++;
			}
		}
		
		for(int i=0;i<arr.length/2;i++) {
			System.out.println(arr[i]);
		}
	}

}
