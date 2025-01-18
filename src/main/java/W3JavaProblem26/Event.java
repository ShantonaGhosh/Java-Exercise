
package W3JavaProblem26;

import java.util.Date;


public class Event {
      private String eventName;
      private Date date;
      private String location;

    public Event(String eventName, Date date, String location) {
        this.eventName = eventName;
        this.date = date;
        this.location = location;
    }
    
    public boolean isEventConflict(Event othersEvent){
        return this.date.equals(othersEvent.date) && this.location.equals(othersEvent.location);
        
    }
      public void displayDetails() {
        System.out.println("Event Name: " + eventName);
        System.out.println("Date: " + date);
        System.out.println("Location: " + location);
    }
      
   
}
