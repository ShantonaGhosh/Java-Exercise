package W3JavaProblem28;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        ResortReservation resortReservation = new ResortReservation("TY45", "sonargao", LocalDate.now(), 101);

        resortReservation.checkReservationStatus();
        System.out.println();

        resortReservation.modifyReservation("jolsiri", LocalDate.of(2024, 6, 15), 102);
        resortReservation.checkReservationStatus();
        System.out.println();

        RailwayReservation railwayReservation = new RailwayReservation("A002", "shanta", LocalDate.now(), 22);

        railwayReservation.checkReservationStatus();
        System.out.println();

        railwayReservation.modifyReservation("Sharmi", LocalDate.of(2024, 6, 20), 23);
        railwayReservation.checkReservationStatus();
    }
}
