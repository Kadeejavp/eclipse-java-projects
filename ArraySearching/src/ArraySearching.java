import java.util.Scanner;

public class ArraySearching {
	public static void main(String a[]) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the limit of the array");
		int limit=s.nextInt();
		System.out.println("enter the values of the array");
		int[]array=new int[limit];
		for(int i=0;i<limit;i++) {
			array[i]=s.nextInt();
			
		}
		int flag=0;
		System.out.println("enter searchkey");
		int searchkey=s.nextInt();
		for(int i=0;i<limit;i++) {
			if(searchkey==array[i]) {
				flag=i+1;
				break;
		}
		}
		if(flag!=0) {
			System.out.println("entered value found at position"+flag);
		}
		else {
			System.out.println("value not found");
		}
			
		}
				
	}


