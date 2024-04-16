package compositeHomework2;



public class Ex2 {

	public static void main(String[] args)
	{
		//Creating components
		Button button1 = new Button();
		Button button2 = new Button();
		Button button3 = new Button();
		
		Panel mainPanel =  new Panel();
		
		mainPanel.addComponent(button1);
		mainPanel.addComponent(button2);

		Panel secondaryPanel = new Panel();
		
		secondaryPanel.addComponent(button3);
		
		mainPanel.addComponent(secondaryPanel);
		
		mainPanel.draw();
	}
}
