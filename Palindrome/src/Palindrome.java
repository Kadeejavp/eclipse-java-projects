import java.util.Scanner;

public class Palindrome {
	public static void main(String b[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter word");
		String word=s.nextLine();
		int length=word.length();
		int flag=0;
		for(int i=0;i<length;i++) {
			if(word.charAt(i)!=word.charAt(length-i-1)) {
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println(word+" is a palindrome");
		}else {
			System.out.println(word+" is not a palindrome");
		}
}
}