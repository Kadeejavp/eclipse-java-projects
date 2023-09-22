import java.util.Scanner;

public class PrintEvenNumbers {
	public static void main(String b[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		for(int i=2;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
}
