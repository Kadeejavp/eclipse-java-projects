
public class TextScanner {
	Hello obj;
	TextScanner(Hello obj){
		this.obj=obj;
	}
void scan() {
	
	
	String text="scanned text";
	obj.onText(text);
}
}
