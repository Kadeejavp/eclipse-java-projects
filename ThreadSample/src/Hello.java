
public class Hello {
	public static void main(String[] args) {
SampleThread st=new SampleThread();
Thread t=new Thread(st);
SampleThread st1=new SampleThread();
Thread t1=new Thread(st1);
SampleThread st2=new SampleThread();
Thread t2=new Thread(st2);
		t.start();
		t1.start();
		t2.start();
		
	} 
		

	

}
