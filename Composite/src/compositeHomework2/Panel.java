package compositeHomework2;

import java.util.ArrayList;
import java.util.List;


public class Panel implements GUIComponent {

	private List<GUIComponent> components = new ArrayList<>();
	
	@Override
	public void draw() {
		System.out.println("Panel drawn!");
		
	}

	public void addComponent(GUIComponent component)
	{
		components.add(component);
	}
	
}
