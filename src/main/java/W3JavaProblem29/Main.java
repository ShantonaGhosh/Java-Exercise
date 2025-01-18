
package W3JavaProblem29;


public class Main {
    public static void main(String[] args) {
    
        Dog dog = new Dog("tison", 3, "tunu");

    
        Bird bird = new Bird("doyel", 2, 0.5);

        System.out.println("Dog Details:");
        dog.displayDetails();
        System.out.println("Dog's age in human years: " + dog.calculateHumanAge());

      
     
        bird.displayDetails();
        System.out.println("Bird's age in human years: " + bird.calculateHumanAge());
    }
}
