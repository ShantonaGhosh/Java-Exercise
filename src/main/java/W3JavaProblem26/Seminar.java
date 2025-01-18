
package W3JavaProblem26;

import java.util.Date;


public class Seminar extends Event{
    private int numberOfSpeaker;

    public Seminar(String eventName, Date date, String location,int numberOfSpeaker) {
        super(eventName, date, location);
        this.numberOfSpeaker = numberOfSpeaker;
        
  
    }
     @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Speakers: " + numberOfSpeaker);
    }
    
}
