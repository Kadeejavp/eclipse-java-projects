
public class ArraySwapping {
	public static void main(String a[]) {
		int[]array1= {1,2,3,4};
		int[]array2= {10,20,30,40};
		for(int i=0;i<=3;i++) {
			int temp=array1[i];
			array1[i]=array2[i];
			array2[i]=temp;
			}
		System.out.println("arrays after swapping:");
		System.out.println("array1:");
		for(int i=0;i<3;i++) {
			System.out.println(array1[i]);
		}
		System.out.println("array2:");
		for(int i=0;i<3;i++) {
			System.out.println(array2[i]);
		}
		}
	}


