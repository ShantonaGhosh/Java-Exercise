
package w3JavaProblem27;

import java.time.LocalDate;


public class Main {
     public static void main(String[] args) {
          CustomerOrder order = new CustomerOrder(01, "Asih Wanjiku", LocalDate.now());
        
        order.displayOrderDetails();
        System.out.println();

       
        OnlineOrder onlineOrder = new OnlineOrder(01, "Rajbari", LocalDate.now(), "163/5", 45);
     
        onlineOrder.displayOrderDetails();
      
       // String deliveryTime = onlineOrder.calculateDeliveryTime();
       // System.out.println("Estimated Delivery Time: " + deliveryTime + " days");
   
        onlineOrder.updateTrackingStatus("On Going");
     }
}
