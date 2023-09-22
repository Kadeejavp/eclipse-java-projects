import java.util.Scanner;

public class ArraySorting {
	public static void main(String a[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the limit of the array");
		int limit=s.nextInt();
		int[]array=new int[limit];
		System.out.println("enter the values of the array");
		for(int i=0;i<limit;i++) {
			array[i]=s.nextInt();
		}
		for(int i=0;i<limit-1;i++) {
		for(int j=i+1;j<limit;j++) {
			if(array[i]>array[j]) {
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
	}
		System.out.println("sorted array is:");
		for(int i=0;i<limit;i++) {
			System.out.println(array[i]);
		}

}
}