
public class Sample {
	public static void main(String a[]) {
		int num1=100;
		int num2=200;
		
		int num3=120;
		int num4=45;
		
		Sum s1=new Sum();
		Sum s2=new Sum();
		
		s1.calculatesum(num1, num2);
		s1.displaysum();
		
		s2.calculatesum(num3, num4);
		s2.displaysum();
		
		s1.displaysum();
	}

}
