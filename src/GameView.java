import model.Card;
import model.Game;

import java.util.Scanner;

public class GameView
{

    private Game _model;

    private Scanner _scanner = new Scanner(System.in);


    public GameView(Game model)
    {
        _model = model;
//        _model.addEventListener(_modelListener);
    }


    public boolean askUserForNextStep()
    {
        String playerName = _model.getCurrentPlayer().getName();
        int playerPoints = _model.getCurrentPlayer().getPoints();

        System.out.println("-------------------------------------------");
        System.out.println(playerName + ". У вас " + playerPoints + " очков. Хотите взять еще карту? (y/n)");

        return _scanner.next().equals("y");
    }


    public void showStepResult()
    {
        Card lastCard = _model.getLastCard();

        System.out.println("Вам выпвла карта: " + lastCard.getName());
    }


    public void showGameResult()
    {
        System.out.println("=================================================================");
        System.out.println("Игра закончена. Победил игрок " + _model.getWinner().getName());
        System.out.println("=================================================================");
    }
}
