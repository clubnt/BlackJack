import model.Game;

public class GameController
{
    private Game _game;
    private GameView _view;

    public GameController(Game game, GameView view)
    {
        _game = game;
        _view = view;

        while (!_game.getIsFinish())
        {
            if(_view.askUserForNextStep())
            {
                _game.makeStep();
                _view.showStepResult();
            }else
            {
                _game.changePlayer();
            }
        }

        _view.showGameResult();
    }

}
