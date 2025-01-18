
package w3JavaProblem27;

import java.time.LocalDate;
import java.util.Date;

public class CustomerOrder {
     private int orderId;
     private String customer;
              private LocalDate  orderDate;

    public CustomerOrder(int orderId, String customer, LocalDate orderDate) {
        this.orderId = orderId;
        this.customer = customer;
        this.orderDate = orderDate;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public LocalDate getDate() {
        return orderDate;
    }

    public void setDate(LocalDate date) {
        this.orderDate = orderDate;
    }
     public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer);
        System.out.println("Order Date: " + orderDate);
    }
              
}
