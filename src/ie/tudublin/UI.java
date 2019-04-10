package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet

{	
	public int r;
    public int g;
    public int b;
	public int value;
	public int resistorValue;
	private String colour;
	Table table;
	Table table2;

	ArrayList<Colour> colours = new ArrayList<Colour>();
	ArrayList<Resistor> resistors = new ArrayList<Resistor>();

	public void loadResistors()
	{
		table2 = loadTable("resistors.csv");
		for (TableRow row : table2.rows())
		{
			resistorValue = row.getInt(b);
			resistors.add(new Resistor(resistorValue));
		}
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
    
			colours.add(new Colour(r,g,b,value,colour));
		}

	}

	public void printColours()
	{
		for (int i = 0; i < 5; i++) {
			Colour colour = colours.get(i);
			colour.display();
		  }
	}

	public Colour findColour(int value)
	{
		if(value == 0)
		{
			return Colour.colour;
		}
		
		if(value == 1)
		{
			return Colour(1);
		}
	}
	
	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);
	}

	public void setup() 
	{
	}
	
	public void draw()
	{			
	}
}
