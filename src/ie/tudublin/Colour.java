package ie.tudublin;

import processing.data.Table;

public class Colour
{
    Table table;
    public int r;
    public int g;
    public int b;
    public int value;
    private String colour;

    public void Colour(int value, String colour)
    {
        this.colour = colour;
        this.value = value;


    }

    public String toString()
    {
        return colour + "\t" + value;
    }

}