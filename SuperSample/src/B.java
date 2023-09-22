
public class B extends A{
	int a;
	B(){
		System.out.println("hello B");
	}
	B(int a){
		super(20);
		System.out.println("its argument constructor of B");
	}
	void display() {
		
		System.out.println("B");
		
		a=20;
		super.a=200;
		int c=a+super.a;
		System.out.println(c);
	}
	
	void basedisplay() {
		super.display();
	}
	
	public static void main(String[] args) {
		B b=new B(10);
		/*b.display();*/
		
		
	}

}
