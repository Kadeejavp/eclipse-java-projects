import java.util.Scanner;

public class FunctionWithoutArgumentWithoutReturnValue {
	public static void main(String a[]) {
		sum();
	}
static void sum() {
	Scanner s=new Scanner(System.in);
	System.out.println("enter 2 numbers");
	int num1=s.nextInt();
	int num2=s.nextInt();
	int result=num1+num2;
	System.out.println(result);
}
}
