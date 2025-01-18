
package W3JavaProblem25;

public class Building {
    
    private String address;
    private int numberOfFloor;
    private double totalArea;

    public Building(String address, int numberOfFloor, double totalArea) {
        this.address = address;
        this.numberOfFloor = numberOfFloor;
        this.totalArea = totalArea;
    }

   public void displayInfo() {
        System.out.println("Address: " + address);
        System.out.println("Number of Floors: " + numberOfFloor);
        System.out.println("Total Area: " + totalArea);
    }
    
    
}
