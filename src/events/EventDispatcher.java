package events;

import java.util.ArrayList;


public abstract class EventDispatcher implements IEventDispatcher
{
	
	ArrayList<EventListener> _listenersList = new ArrayList<EventListener>();
	
	
	public void addEventListener(EventListener listener)
	{
		_listenersList.add(listener);
	}
	
	
	public void removeEventListener(EventListener listener)
	{
		_listenersList.remove(listener);
	}
	
	
	public void dispatchEvent(Event event)
	{
		for (EventListener listener : _listenersList)
		{
			listener.onEvent(event);
		}
	}
	
}
