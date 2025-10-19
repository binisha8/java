public class autoboxing {
    public static void main(String[] args) {
        int x=5;
        float y=3.44F;
        long z=6000;

//Autoboxing
        Integer intObj =x;
        Float floatObj=y;
        Long longObj=z;

        System.out.println(intObj);
        System.out.println(floatObj);
        System.out.println(longObj);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.max(5, 8));

       
    }
}
