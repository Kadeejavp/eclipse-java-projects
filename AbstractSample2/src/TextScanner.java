
public class TextScanner {
	
	Sample obj;
	public TextScanner(Sample obj) {
		this.obj=obj;
		
	}
	void scan() {
		
		String Text="scanned text";
		obj.onText(Text);
	}

}
