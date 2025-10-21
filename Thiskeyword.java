
class Complex{
    int real;
    int img;

    //Constructor
    Complex(int real,int img){
        this.real=real;
        this.img=img;

    void print(){
      
        System.out.println(this.real + " + "+this.img+ "i");

    }
     Complexnum add(Complexnum y){
        int sumReal=real + y.real;
        int sumimg=img+ y.img;
        Complexnum result = new Complexnum(sumReal,sumimg);
        return result; 

    }


}




public class Thiskeyword {
    public static void main(String[] args) {
        Complexnum x = new Complexnum(2, 9);
        x.print();
        System.out.println("x="+x);
        
    }
    
}
}
