package model.events;

import events.Event;

public class GameEvent extends Event
{

    public static final String GAME_FINISH = "onGameFinish";
    public static final String STEP = "step";

    public GameEvent(String eventType)
    {
        super(eventType);
    }
}
