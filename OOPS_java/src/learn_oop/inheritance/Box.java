package learn_oop.inheritance;

class Box {
    double l, h, w;

    // Default constructor
    Box() {
        this.l = this.h = this.w = -1;
    }

    // Cube constructor
    Box(double side) {
        this.l = this.h = this.w = side;
    }

    // Parameterized constructor
    Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    // Copy constructor
    Box(Box old) {
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }
}
