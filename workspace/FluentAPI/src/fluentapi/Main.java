package fluentapi;

public class Main {
	public static void main(String[] args) {
		FrameBuilder fb = new FrameBuilder();
		ContentBuilder cb = new ContentBuilder();
		
		fb.frame("A")
			.width(200)
			.height(100)
			.content(
					cb
					.label("Hello")
					.button("World")
					.label("!!!!")
			)
			.show();
		
	}
}
