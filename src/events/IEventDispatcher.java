package events;

public interface IEventDispatcher
{
	
	void addEventListener(EventListener listener);

	void removeEventListener(EventListener listener);

	void dispatchEvent(Event event);

}
