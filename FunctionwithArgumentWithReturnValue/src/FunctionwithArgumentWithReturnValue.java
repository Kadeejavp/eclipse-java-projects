import java.util.Scanner;

public class FunctionwithArgumentWithReturnValue {
	public static void main(String a[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter 2 numbers");
		int num1=s.nextInt();
		int num2=s.nextInt();
		int result=sum(num1,num2);
		System.out.println("result is:"+result);
	}
static int sum(int a,int b) {
	int c=a+b;
	return c;
	
	
}
}
