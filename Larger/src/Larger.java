import java.util.Scanner;

public class Larger {
	public static void main(String b[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter 3 numbers");
		int num1=s.nextInt();
		int num2=s.nextInt();
		int num3=s.nextInt();
		if(num1>num2) {
			if(num1>num3) {
				System.out.println(num1+"is larger");
			}else {
				System.out.println(num3+"is larger");
			}
		}else {
			if(num2>num3) {
				System.out.println(num2+"is larger");
			}else {
				System.out.println(num3+"is larger");
			}
		}
			
		}

}
