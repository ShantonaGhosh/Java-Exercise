/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W3JavaProblem29;


class Bird extends Pet {

    double wingSpan;


    public Bird(String name, int age, double wingSpan) {
        super(name, "Bird", age); 
        this.wingSpan = wingSpan;
    }


    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Wing Span: " + wingSpan + " meters");
    }
}

