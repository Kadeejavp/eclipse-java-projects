
public class Sample {
	void onText(String text) {
		System.out.println(text);
	}

	Sample(){
		TextScanner ts=new TextScanner();
		ts.scan();
	}
	

	public static void main(String[] args) {
		Sample s=new Sample();
}
}