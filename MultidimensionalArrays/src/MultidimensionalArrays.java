import java.util.Scanner;

public class MultidimensionalArrays {
	public static void main(String b[]) {
		Scanner s=new Scanner(System.in);
		int[][]array=new int[3][3];
		System.out.println("enter values");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				array[i][j]=s.nextInt();
			}
			
		}
		System.out.println("entered array is:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(array[i][j]+"  ");
			}System.out.println();
		}
			
		
		
	}

}
