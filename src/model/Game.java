package model;


import events.EventDispatcher;

public class Game extends EventDispatcher
{
    private final int _MAX_POINTS = 21;

    private Player _currentPlayer;
    private Player _winner;
    private Deck _deck;

    private Player _player1;
    private Player _player2;

    private boolean _isFinish = false;

    private Card _lastCard;


    public Game()
    {
        _deck = new Deck();

        _player1 = new Player("Player1");
        _player2 = new Player("Player2");

        _currentPlayer = _player1;

        _player1.addPoints(_deck.getNextCard().getValue());
        _player2.addPoints(_deck.getNextCard().getValue());
        _player1.addPoints(_deck.getNextCard().getValue());
        _player2.addPoints(_deck.getNextCard().getValue());

    }


    public void finish()
    {
        _isFinish = true;

        if(_player1.getPoints() > _MAX_POINTS)
        {
            _winner = _player2;
            return;
        }

        if(_player2.getPoints() > _MAX_POINTS)
        {
            _winner = _player1;
            return;
        }

        if(_player1.getPoints() > _player2.getPoints())
        {
            _winner = _player1;
        }else
        {
            _winner = _player2;
        }
    }


    public boolean getIsFinish()
    {
        return _isFinish;
    }


    public Player getWinner()
    {
        return _winner;
    }


    public Player getCurrentPlayer()
    {
        return _currentPlayer;
    }


    public void changePlayer()
    {
        if(_currentPlayer.equals(_player2))
        {
            finish();
            return;
        }
        _currentPlayer = _player2;
    }


    public Card getLastCard()
    {
        return _lastCard;
    }


    public void makeStep()
    {
        _lastCard = _deck.getNextCard();

        _currentPlayer.addPoints(_lastCard.getValue());

        if(_currentPlayer.getPoints() > _MAX_POINTS)
        {
            finish();
        }
    }



}
