import java.util.Scanner;

public class Grade {
	public static void main(String a[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("\"enter your total mark percentage");
		float mark=s.nextInt();
		if(mark>=90) {
			System.out.println("grade obtained is A");
		}else {
			System.out.println("invalid");
		}
		
	}

}
