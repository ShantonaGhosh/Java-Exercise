package W3JavaProblem26;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        Seminar seminar = new Seminar("Shoner Bangla", date, "Convention Center", 5);
        List performerInConcert = new ArrayList<>();
        performerInConcert.add("jolsiri band");
        performerInConcert.add("rock band");
        MusicalPerformance concert = new MusicalPerformance("Pitha Utsob", date, "ICCB", performerInConcert);
        seminar.displayDetails();
        concert.displayDetails();
        if (seminar.isEventConflict(concert)) {
            System.out.println("conflict");
        } else {
            System.out.println("not conflict");
        }
    }

}
