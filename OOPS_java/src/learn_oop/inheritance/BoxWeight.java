package learn_oop.inheritance;

public class BoxWeight extends Box {
    double weight;

    // Default constructor
    public BoxWeight() {
        super(); // calls Box() constructor
        this.weight = -1;
    }

    // Parameterized constructor
    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // calls Box(double l, double h, double w)
        this.weight = weight;
    }
}
