import java.util.Scanner;

public class Days {
	public static void main(String a[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number between 1 and 7");
		int number=s.nextInt();
		switch(number) {
		case 1:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("monday");
			break;
		case 3:
			System.out.println("tuesday");
			break;
		case 4:
			System.out.println("wednesday");
			break;
		case 5:
			System.out.println("thursday");
			break;
		case 6:
			System.out.println("friday");
			break;
		case 7:
			System.out.println("saturday");
			break;
		default:
			System.out.println("fool");
				
		}
		
	}

}
