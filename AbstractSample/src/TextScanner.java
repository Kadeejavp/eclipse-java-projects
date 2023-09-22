
public class TextScanner {
	Hello obj;
	public TextScanner(Hello obj) {
		this.obj=obj;
		

	}
	void scan() {
		
		
		
		String Text="scanned text";
		obj.onText(Text);
	}

}
