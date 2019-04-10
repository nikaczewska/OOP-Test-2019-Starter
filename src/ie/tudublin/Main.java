package ie.tudublin;

import java.util.ArrayList;
import java.util.List;

import processing.data.*;
import processing.core.PApplet;

public class Main {

	public int r;
    public int g;
    public int b;
    public int value;
    private String colour;
	Table table;

	ArrayList<Colour> colours = new ArrayList<Colour>();

	public void helloProcessing() {
		String[] a = { "MAIN" };
		processing.core.PApplet.runSketch(a, new UI());
	}

	public void loadColours() 
	{
		table = loadTable("colours.csv", "header");
		for (TableRow row : table.rows()) 
		{

			r = row.getInt("r");
			g = row.getInt("g");
			b = row.getInt("b");
			colour = row.getString("colour");
   			value = row.getInt("value");
    
			colours.add(new Colour(colour));
		}

	}


	public void printColours()
	{
		for (int i = 0; i < table.size(); i++) {
			Colour colour = colours.get(i);
			colour.display();
		  }


	}

	public static void main(String[] args)
	{
		Main main = new Main();
		main.helloProcessing();		
	}
}