class Car {
    String model;
    String color;
    int price;
    boolean isLocked = false;

    //constructor with no argument
    Car(){
        System.out.println("In the default constructor");
        System.out.println("In the parametariized constructor");
        model="hatchback";
        color="Black";
        price=10000;
    

    }

    // Constructor
    Car(String modelName, String colorName, int priceValue) {
        model = modelName;
        color = colorName;
        setPrice(priceValue); // Using setter to validate the price
    }

    void drive() {
        System.out.println("Zoom zoom zoom!");
    }

    void lock() {
        isLocked = true;
        System.out.println("Car is now locked.");
    }

    void unlock() {
        isLocked = false;
        System.out.println("Car is now unlocked.");
    }

    // Getter for price property
    int getPrice() {
        return price;
    }

    // Setter for price property
    void setPrice(int priceValue) {
        if (priceValue < 0) {
            priceValue = 0;
        }
        price = priceValue;
    }
}

public class Constructors {
    public static void main(String[] args) {
        // Create Car objects
        Car c1 = new Car("Hatchback", "Red", 2000);
        Car c2 = new Car();//will call the constructor with no argument

        // Display details
       System.out.println("Car 1: " + c1.model + ", " + c1.color + ", Price: " + c1.getPrice());
        System.out.println("Car 2: " + c2.model + ", " + c2.color + ", Price: " + c2.getPrice());
        System.out.println(c1.model);
        System.out.println(c1.color);
        System.out.println(c1.price);

        System.out.println(c2.model);
        System.out.println(c2.color);
        System.out.println(c2.price);
        
    
    }
}
