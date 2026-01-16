/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg04.complex;

class Complex{
    public double a;
    public double b;
    
    Complex(double a, double b){
        this.a = a;
        this.b = b;
    }
    //ADD
    Complex add(Complex c){
        return new Complex(a + c.a, b + c.b);
    }
    //Substract
    Complex sub(Complex c){
        return new Complex(a-c.a, b-c.b);
    }
    //Multipel
    Complex mult(Complex c){
        double x = a*c.b - b*c.b;
        double y = a*c.b + b*c.a;
        return new Complex (x,y);
    }
    
    void display(){
        System.out.println(a +"+"+ b);
    }  
}

public class Complexdisplay {
    public static void main(String[] args) {
        
        Complex c1 = new Complex(6,3);
        Complex c2 = new Complex(4,4);
        
        Complex sum = c1.add(c2);
        Complex diff = c1.sub(c2);
        Complex mul = c1.mult(c2);
        
        sum.display();
        diff.display();
        mul.display();
    }
}
