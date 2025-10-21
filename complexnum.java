//Write a class to store and perform operetion onn complex number

import java.util.*;
class Complexnum{
    int real;
    int img;

    //constructor
    Complexnum(int r,int i){
        real=r;
        img=i;

    }
    void print(){
        //2+3i
        System.out.println(real+" + "+img+"i");

    }
    Complexnum add(Complexnum y){
        int sumReal=real + y.real;
        int sumimg=img+ y.img;
        Complexnum result = new Complexnum(sumReal,sumimg);
        return result;

    }


}

public class complexnum {
    public static void main(String[] args) {
        Complexnum x = new Complexnum(2,3);
        Complexnum y = new Complexnum(-7,9);
        

       
       x.print();
       y.print();
       Complexnum z = x.add(y);
       System.out.print("The sum is :" );
       z.print();
       

        
    }
    
}
