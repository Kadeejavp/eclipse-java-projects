import java.util.Scanner;

public class ArrayAdding {
	public static void main(String a[]) {
		Scanner s=new Scanner(System.in);
		int[] array = new int[3];
		System.out.println("enter the values");
		for(int i=0;i<3;i++) {
			array[i]=s.nextInt();
		}
		System.out.println("sum of the array is:");
		int sum=0;
		for(int i=0;i<3;i++) {
			sum=sum+array[i];
		}
		System.out.println(sum);
		
				
	}
}
