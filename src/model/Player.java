package model;


public class Player
{
    private String _name;
    private int _points = 0;


    public Player(String name)
    {
        _name = name;
    }


    public int getPoints()
    {
        return _points;
    }


    public void addPoints(int value)
    {
        _points += value;
    }


    public String getName()
    {
        return _name;
    }
}

