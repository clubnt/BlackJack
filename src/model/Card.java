package model;

public class Card
{

    private String _name;
    private int _value;

    public Card(String name, int value)
    {
        _name = name;
        _value = value;
    }

    public String getName()
    {
        return _name;
    }

    public int getValue()
    {
        return _value;
    }

}
