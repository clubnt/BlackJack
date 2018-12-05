import model.Game;

public class Launcher
{

    public static void main(String[] arg)
    {
        Game model = new Game();
        GameView view = new GameView(model);
        new GameController(model, view);
    }

}
