
package W3JavaProblem28;


import java.time.LocalDate;

public class ResortReservation extends Reservation {
  
    private int roomNumber;

    public ResortReservation(String reservationId, String customerName, LocalDate date, int roomNumber) {
        super(reservationId, customerName, date); 
        this.roomNumber = roomNumber;
    }

 
    @Override
    public void checkReservationStatus() {
        super.checkReservationStatus(); 
        System.out.println("Room Number: " + roomNumber);
    }


    public void modifyReservation(String newCustomerName, LocalDate newDate, int newRoomNumber) {
        super.modifyReservation(newCustomerName, newDate);
        this.roomNumber = newRoomNumber;
        System.out.println("Room Number updated successfully.");
    }

  
    public int getRoomNumber() {
        return roomNumber;
    }
}
