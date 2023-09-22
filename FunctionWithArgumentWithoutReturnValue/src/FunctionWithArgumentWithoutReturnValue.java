import java.util.Scanner;

public class FunctionWithArgumentWithoutReturnValue {
	public static void main(String a[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter 2 numbers");
		int num1=s.nextInt();
		int num2=s.nextInt();
		sum(num1,num2);
	}
static void sum(int a,int b) {
	int c=a+b;
	System.out.println("result is:"+c);
}
}
