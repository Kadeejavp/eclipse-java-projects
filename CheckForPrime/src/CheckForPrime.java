import java.util.Scanner;

public class CheckForPrime {
	public static void main(String a[]) {
		System.out.println("enter a number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int flag=0;
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				flag=1;
				break;
			}
		}if(flag==0) {
			System.out.println("number is prime");
		}else {
			System.out.println("number is not prime");
		}
	
	}
	
	

}
