
package W3JavaProblem28;

import java.time.LocalDate;



public class Reservation {

    private String reservationId;
    private String customerName;
    private LocalDate date;


    public Reservation(String reservationId, String customerName, LocalDate date) {
        this.reservationId = reservationId;
        this.customerName = customerName;
        this.date = date;
    }


    public void checkReservationStatus() {
        System.out.println("Reservation ID: " + reservationId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Date: " + date);
        System.out.println("Status: Confirmed");
    }

    
    public void modifyReservation(String newCustomerName, LocalDate newDate) {
        this.customerName = newCustomerName;
        this.date = newDate;
        System.out.println("Reservation modified successfully.");
    }


    public String getReservationId() {
        return reservationId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public LocalDate getDate() {
        return date;
    }
}

    

