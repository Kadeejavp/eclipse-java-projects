
public class ArraySortDescending {
	public static void main(String a[]) {
		int[]array= {5,10,250,115};
		for(int i=0;i<3;i++) {
			for(int j=i+1;j<4;j++) {
				if(array[i]<array[j]) {
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println("sorted array is:");
		for(int i=0;i<4;i++) {
			System.out.println(array[i]);
		}
	}

}
