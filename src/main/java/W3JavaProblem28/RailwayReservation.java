
package W3JavaProblem28;

import java.time.LocalDate;

public class RailwayReservation extends Reservation {

    private int seatNumber;

  
    public RailwayReservation(String reservationId, String customerName, LocalDate date, int seatNumber) {
        super(reservationId, customerName, date); 
        this.seatNumber = seatNumber;
    }

    @Override
    public void checkReservationStatus() {
        super.checkReservationStatus(); 
        System.out.println("Seat Number: " + seatNumber);
    }

  
    public void modifyReservation(String newCustomerName, LocalDate newDate, int newSeatNumber) {
        super.modifyReservation(newCustomerName, newDate); 
        this.seatNumber = newSeatNumber;
        System.out.println("Seat Number updated successfully.");
    }


    public int getSeatNumber() {
        return seatNumber;
    }
}
