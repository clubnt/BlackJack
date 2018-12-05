package model;

import java.util.ArrayList;
import java.util.Collections;

public class Deck
{
    private String[] _cardNames = {"jack", "queen", "king","6", "7", "8", "9", "10", "tuz"};
    private int[] _cardValues = {2, 3, 4, 6, 7, 8, 9, 10, 11};

    private ArrayList<Card> _cards = new ArrayList<>();


    public Deck()
    {
        generateCards();
    }


    public Card getNextCard()
    {
        return _cards.remove(0);
    }

    private void generateCards()
    {
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < _cardNames.length; j++)
            {
                _cards.add(new Card(_cardNames[j], _cardValues[j]));
            }
        }

        Collections.shuffle(_cards);
    }
}
