import java.util.Scanner;

public class StarPrinting {
	public static void main(String b[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int n=s.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}System.out.println();
		}
	}
}
