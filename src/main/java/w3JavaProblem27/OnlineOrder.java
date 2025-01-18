package w3JavaProblem27;

import java.time.LocalDate;

public class OnlineOrder extends CustomerOrder {

    private String deliveryAddress;
    private int trackingNumber;
    private String trackingStatus;

    public OnlineOrder(int orderId, String customer, LocalDate orderDate, String deliveryAddress, int trackingNumber) {
        super(orderId, customer, orderDate);
        this.deliveryAddress = deliveryAddress;
        this.trackingNumber = trackingNumber;
        this.trackingStatus = "pending";

    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public int getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(int trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String calculateDeliveryTime(String deliveryAddress) {

        if (deliveryAddress.contains("Same City")) {
            return "one day";
        } else if (deliveryAddress.contains("Same State")) {
            return "two days";
        } else if (deliveryAddress.contains("Different State")) {
            return "five days";
        } else {
            return "seven days";
        }
    }

    public void updateTrackingStatus(String newStatus) {
        trackingStatus = newStatus;
        System.out.println("Tracking Status Updated: " + trackingStatus);
    }

    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Delivery Address: " + deliveryAddress);
        System.out.println("Tracking Number: " + trackingNumber);
    }

}
