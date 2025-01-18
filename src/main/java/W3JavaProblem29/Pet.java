
package W3JavaProblem29;


class Pet {

    String name;
    String species;
    int age;

  
    public Pet(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

 
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
        System.out.println("Age: " + age + " years");
    }

 
    public int calculateHumanAge() {
        if (species.equals("Dog")) {
            return age * 7;
        } else {
           
            return age;
        }
    }
}

