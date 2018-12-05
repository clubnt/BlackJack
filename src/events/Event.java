package events;

public class Event
{
	
	public static final String CHANGE = "change";
	
	private String _eventType;
	
	
	public Event(String eventType)
	{
		_eventType = eventType;
	}
	
	
	public String getType()
	{
		return _eventType;
	}

}
