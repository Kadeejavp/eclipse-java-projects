package ifsample;

import java.util.Scanner;

public class IfSample {
	
	public static void main(String a[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a number");
		
		int num=sc.nextInt();
		
		if(num<0) {
			System.out.println("number is negative");
		
		}else {
			System.out.println("number is positive");
		}
	}

}
