import java.util.Scanner;

public class SumOfOddNumbers {
	public static void main(String a[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int number=s.nextInt();
		int sum=0;
		for(int i=1;i<=number;i++) {
			if(i%2!=0) {
				sum=sum+i;
			}
		}
		System.out.println("sum of odd numbers until "+number+" is");
		System.out.print(sum);
	}

}
