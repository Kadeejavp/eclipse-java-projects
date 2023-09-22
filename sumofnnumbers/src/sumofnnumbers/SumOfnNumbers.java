package sumofnnumbers;

import java.util.Scanner;

public class SumOfnNumbers {
	
	public static void main(String b[]) {
		
		System.out.println("enter a number");
		
		Scanner scan=new Scanner(System.in);
		
		int number=scan.nextInt();
		
		int sum=0;
		
		for(int i=0;i<number;i++) {
			sum=sum+i;
			
		}
		System.out.println("result is:"+sum);
	}

}
