package W3JavaProblem30;

public class Main {

    public static void main(String[] args) {

        GymMembership basicMember = new GymMembership("shanta", "Monthly", 6);

        PremiumMembership premiumMember = new PremiumMembership("sharmi", "Annual", 12, true, true);

        basicMember.displayDetails();

        premiumMember.displayDetails();
    }
}
