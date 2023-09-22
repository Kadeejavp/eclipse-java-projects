import java.util.Scanner;

public class FunctionWithoutArgumentWithReturnValue {
	public static void main(String a[]) {
		int result=sum();
		System.out.println(result);
	}
static int sum() {
	Scanner s=new Scanner(System.in);
	System.out.println("enter 2 numbers");
	int num1=s.nextInt();
	int num2=s.nextInt();
	int result=num1+num2;
	return result;
}
}
