
package W3JavaProblem26;

import java.util.Date;
import java.util.List;

public class MusicalPerformance extends Event{
    List performerInConcert;

    public MusicalPerformance(String eventName, Date date, String location,List performerInConcert) {
        super(eventName, date, location);
        this.performerInConcert =performerInConcert;
    }
      @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Performers: " + String.join(" , ", performerInConcert));
    }
}
