package ie.tudublin;

public class Resistor
{
    public int value;
    public int ones;
    public int tens;
    public int hundreds;

    public void Resistor(int value)
    {
        hundreds = (value / 100);
        tens = (value - (hundreds * 100)) / 10;
        ones = value - ((hundreds * 100)  + (tens * 10));
        System.out.println(hundreds + ",");
        System.out.println(tens + ",");
        System.out.println(ones);
    }

}