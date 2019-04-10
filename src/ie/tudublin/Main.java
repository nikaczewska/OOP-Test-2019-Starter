package ie.tudublin;

import java.util.ArrayList;

public class Main
{	
	ArrayList<Colour> colours = new ArrayList<Colour>();

	public void helloProcessing()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new UI());
	}
	
	public static void main(String[] args)
	{
		Main main = new Main();
		main.helloProcessing();		
	}
}