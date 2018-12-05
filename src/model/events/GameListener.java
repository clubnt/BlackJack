package model.events;

import events.Event;
import events.EventListener;


public abstract class GameListener extends EventListener
{
    public abstract void onGameFinish(GameEvent event);
    public abstract void onGameStep(GameEvent event);


    @Override
    public void onEvent(Event event)
    {
        switch (event.getType())
        {
            case GameEvent.GAME_FINISH:
                onGameFinish((GameEvent) event);
                break;
            case GameEvent.STEP:
                onGameStep((GameEvent) event);
                break;
        }
    }
}
