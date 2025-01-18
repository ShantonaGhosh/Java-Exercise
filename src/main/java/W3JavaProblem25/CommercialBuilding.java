
package W3JavaProblem25;

public class CommercialBuilding extends Building{
    
    private double officeSpace;
    private double rentPersquareMeter;
    
    public CommercialBuilding(String address, int numberOfFloor, double totalArea,double officeSpace,double rentPersquareMeter) {
        super(address, numberOfFloor, totalArea);
        this.officeSpace = officeSpace;
        this.rentPersquareMeter = rentPersquareMeter;
    }
    public double totalRent(){
        return officeSpace * rentPersquareMeter;
    }
    
     @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("officeSpace: " + officeSpace);
        System.out.println("rentPersquareMeter: " + rentPersquareMeter);
        System.out.println("Total Rent: " + totalRent());
    }
}
