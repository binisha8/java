class MethodOverloading {
    // First method - for integers
    static int add(int a, int b) {
        System.out.println("Inside first add");
        return a + b;
    }

    // Second method - for strings
    static String add(String a, String b) {
        System.out.println("Inside second add");
        return a + b;
    }

    // Third method - int and String
    static String add(int a, String b) {
        System.out.println("Inside third add");
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(5, 4));            // calls int version
        System.out.println(add("Hello ", "World")); // calls String version
        System.out.println(add(5, "World"));      // calls int-String version
    }   
}
