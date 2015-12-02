
public class Event {
	private String eventName;
	private String eventLocation;
	private ArrayList<String> attendees;
	
	public Event(String name, String location, ArrayList<String> people) {
		eventName = name;
		eventLocation = location;
		attendeees = people;
	}
	
	public String getEventName() {
		return eventName;
	}
	
	public String getEventLocation() {
		return eventLocation;
	}
	
	public ArrayList<String> getAttendees() {
		return attendees;
	}
}
