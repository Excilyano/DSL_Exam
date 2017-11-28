package fluentapi;

import java.awt.FlowLayout;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class FrameBuilder {
	private JFrame frame;
	private int width = 0;
	private int height = 0;
	
	public FrameBuilder() {
	}
	
	public FrameBuilder frame(String name) {
		this.frame = new JFrame(name);
		this.frame.setLayout(new FlowLayout());
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		return this;
	}
	
	public FrameBuilder title(String title) {
		this.frame.setTitle(title);
		return this;
	}
	
	public FrameBuilder width(int width) {
		this.width = width;
		this.frame.setSize(this.width, this.height);
		return this;
	}
	
	public FrameBuilder height(int height) {
		this.height = height;
		this.frame.setSize(this.width, this.height);
		return this;
	}
	
	public FrameBuilder content(ContentBuilder cb) {
		for (JComponent c : cb.getComponents()) {
			this.frame.add(c);
		}
		return this;
	}
	
	public void show() {
		this.frame.setVisible(true);
	}
}
