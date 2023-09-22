import java.util.Scanner;

public class ArrayUsingFunctions {
	public static void main(String a[]) {
		int[]array= get();
		display(array);
	}



static int[] get() {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the limit of the array");
	int limit=s.nextInt();
	int[]array=new int[limit];
	System.out.println("enter the values of the array");
	for(int i=0;i<limit;i++) {
		array[i]=s.nextInt();
	}
	return array;

}
static void display(int[] array) {
	System.out.println("array elements:");
	for(int i=0;i<array.length;i++) {
		System.out.println(array[i]);
	}
}
}