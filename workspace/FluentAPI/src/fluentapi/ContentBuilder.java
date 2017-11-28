package fluentapi;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class ContentBuilder {
	private List<JComponent> elements = new ArrayList<JComponent>();
	
	public ContentBuilder button(String name) {
		elements.add(new JButton(name));
		return this;
	}
	
	public ContentBuilder label(String name) {
		elements.add(new JLabel(name));
		return this;
	}
	
	public List<JComponent> getComponents() {
		return this.elements;
	}
}
