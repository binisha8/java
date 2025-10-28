package learn_oop.inheritance;

public class Main {
    public static void main(String[] args) {
        // Create an object of the child class
        BoxWeight b = new BoxWeight(2, 3, 4, 8);

        // Display properties
        System.out.println("Length: " + b.l);
        System.out.println("Height: " + b.h);
        System.out.println("Width: " + b.w);
        System.out.println("Weight: " + b.weight);

        // Demonstrate polymorphism
        Box parentRef = new BoxWeight(5, 6, 7, 10);
        System.out.println(parentRef.w);
        System.out.println("\nAccessing through parent reference:");

        System.out.println("Length: " + parentRef.l);
        System.out.println("Width: " + parentRef.w);
        System.out.println("Height: " + parentRef.h);
        // System.out.println(parentRef.weight); // ❌ Not allowed (only in child)
       
    }
}
