import java.util.ArrayList;
import java.util.List;

public class EventLog {

    private List<Event> eventList;

    public boolean addEvent(Event event) throws IllegalArgumentException {
        ArrayList<String> legalEventNames = new ArrayList<>();
        legalEventNames.add("Face2Face");
        legalEventNames.add("PhoneCall");
        legalEventNames.add("TextMessaging");
        legalEventNames.add("Unknown");

        if ((event == null) || (event.name == null) || (event.action == null)) {
            throw new IllegalArgumentException();
        } else if (!legalEventNames.contains(event.name)){
            throw new IllegalArgumentException();
        }else {
            System.out.println("This event was added: " + event.name);
            eventList.add(event);
        }
        return true;
    }

    public int getNumEvents() { //return size of list
        return eventList.size();
    }

    public EventLog() { //method to initialize list in an instance
        eventList = new ArrayList<>();
    }
}
