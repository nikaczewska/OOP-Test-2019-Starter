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
	public int x;
	public int y;
	public int resistorWidth;
	public int resistorHeight;
	public int gap;
	public String colourFound;
	Colour colour1;

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
			resistorValue = row.getInt("");
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
			colour1 = colours.get(i);
		  }
	}

	public String findColour(int value)
	{
		for(int i = 0; i < 10; i++)
		{
			if(i == value)
			{
				colourFound = colour1.getColour();
			}
			else
			{
				colourFound = "No match";
			}
		}
		return colourFound;
	

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
		x = 150;
		y = 50;
		gap = 50;
		resistorHeight = 100;
		resistorWidth = 150;

		for(int i = 0; i < 4; i++)
		{
			noFill();
			rect(x,y,resistorWidth, resistorHeight);
			line(x,y + gap,x - 100, y + gap);
			line(x+resistorWidth, y + gap, x+resistorWidth + 100, y + gap);
			/*The fill() would use parameters from the colours ArrayList to generate the correct colour for each rectangle*/ 
			//fill(colour1.r, colour1.g, colour1.b);
			rect(x + 20, y, 10, resistorHeight);
			//fill();
			rect(x + 40, y, 10, resistorHeight);
			//fill();
			rect(x + 60, y, 10, resistorHeight);

			textAlign(CENTER,CENTER);
			text(resistorValue, x + resistorWidth, y);
	

			y = y + gap * 4;


		}

	}
}
