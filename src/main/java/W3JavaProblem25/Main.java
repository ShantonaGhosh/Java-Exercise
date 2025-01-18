package W3JavaProblem25;

public class Main {

    public static void main(String[] args) {
        ResidentialBuilding residentialBuilding = new ResidentialBuilding("161/3,mirpur1", 20, 1800, 15, 1200);
        CommercialBuilding commercialBuilding = new CommercialBuilding("161/3,mirpur2", 12, 3000, 2000, 20);
        residentialBuilding.displayInfo();
        commercialBuilding.displayInfo();
    }

}
