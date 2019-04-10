package ie.tudublin;

import processing.data.Table;

public class Colour
{
    public int r;
    public int g;
    public int b;
    public int value;
    private String colour;

    public Colour(String colour2) {
	}

	public void Colour(int r, int g, int b,int value, String colour)
    {
        this.r = r;
        this.g = g;
        this.b = b;
        this.colour = colour;
        this.value = value;

    }

    public String toString()
    {
        return colour + "\t" + value;
    }

	public void display() {
	}

}