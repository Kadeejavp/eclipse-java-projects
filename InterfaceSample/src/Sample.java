
public class Sample implements Hello{
	public void onText(String text) {
		System.out.println(text);
	}
	
	Sample(){
		TextScanner ts=new TextScanner(this);
		ts.scan();
	}
	public static void main(String[] args) {
		Sample s=new Sample();
		
	}

}