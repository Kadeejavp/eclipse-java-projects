
public class EvenNumbersInArray {
	public static void main(String a[]) {
		int[]array= {5,6,7,8,9,10};
		int flag=0;
		for(int i=0;i<6;i++) {
			if(array[i]%2==0) {
			flag++;
		}
		}
		System.out.println("number of even numbers in the array is"+flag);
		

}
}