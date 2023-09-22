import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String b[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int number=s.nextInt();
		int multiple;
		for(int i=1;i<=10;i++) {
			multiple=i*number;
			System.out.println(i+"*"+number+"="+multiple);
		}
		}
	}


