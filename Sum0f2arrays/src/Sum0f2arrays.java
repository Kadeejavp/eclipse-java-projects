import java.util.Scanner;

public class Sum0f2arrays {
	public static void main(String b[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter rows of the arrays");
		System.out.println("enter columns of the arrays");
		int rows=s.nextInt();
		int columns=s.nextInt();
		int[][]array1=new int[rows][columns];
		System.out.println("enter values of array1");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
			array1[i][j]=s.nextInt();
			}
		}
		int[][]array2=new int[rows][columns];
		System.out.println("enter values of array2");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				array2[i][j]=s.nextInt();
			}
			}
		int[][]sum=new int[rows][columns];
		System.out.println("sum of the arrays :");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
			sum[i][j]=array1[i][j]+array2[i][j];
		}
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.println(sum[i][j]);
			
		}
		
	}
}
}
