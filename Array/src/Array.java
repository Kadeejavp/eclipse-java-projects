import java.util.Scanner;

public class Array {
	public static void main(String a[]) {
		Scanner s=new Scanner(System.in);
		
				System.out.print("enter the limit of the array");
		int limit=s.nextInt();
		int[] array = new int[limit];
		System.out.println("enter the values of the array");
		for(int i=0;i<limit;i++) {
			array[i]=s.nextInt();
		}
		for(int i=0;i<limit;i++) {
			System.out.println(array[i]);
		}
		
	}
	

}
