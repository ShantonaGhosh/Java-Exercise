
package W3JavaProblem25;


public class ResidentialBuilding extends Building {
    private int numberOfApartment;
    private double rentPerApartment;

    public ResidentialBuilding(String address, int numberOfFloor, double totalArea,int numberOfApartment,double rentPerApartment) {
        super(address, numberOfFloor, totalArea);
        this.numberOfApartment=numberOfApartment;
        this.rentPerApartment =rentPerApartment;
    }
    
    public double totalRent(){
        return numberOfApartment * rentPerApartment;
        
    }

 
 
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Apartments: " + numberOfApartment);
        System.out.println("Rent per Apartment: $" + rentPerApartment);
        System.out.println("Total Rent: " + totalRent());
    }   
    
}
