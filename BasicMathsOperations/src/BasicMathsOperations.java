import java.util.Scanner;

public class BasicMathsOperations {
	public static void main(String b[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter 2 numbers");
		int num1=s.nextInt();
		int num2=s.nextInt();
		System.out.println("1 for addition");
		System.out.println("2 for substraction");
		System.out.println("3 for multiplication");
		System.out.println("4 for division");
		System.out.println("enter your choice");
		int choice=s.nextInt();
		DefineOperations op=new DefineOperations();
		switch(choice) {
		case 1:
			int sum=op.addition(num1,num2);
			System.out.println(sum);
			break;
		case 2:
			int difference=op.substraction(num1,num2);
			System.out.println(difference);
			break;
		case 3:
			int multiple=op.multiplication(num1,num2);
			System.out.println(multiple);
			break;
		case 4:
			int division=op.division(num1,num2);
			System.out.println(division);
			break;
			default:
				System.out.println("fool");
		}
	}

}
