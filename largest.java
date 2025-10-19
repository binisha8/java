import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        int maxvalue=Integer.MIN_VALUE;
        for(int i =1; i<=n;i++){
            int current=sc.nextInt();
            maxvalue=Math.max(maxvalue,current);
        }
        System.out.print("Max value is: ");
        System.out.println(maxvalue);
    }
    
}
