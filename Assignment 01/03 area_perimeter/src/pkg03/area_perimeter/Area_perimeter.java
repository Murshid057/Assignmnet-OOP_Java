
package pkg03.area_perimeter;
import java.util.Scanner;

class Circle{
    private int r;
    
    public void read(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radious: ");
        r = input.nextInt();
    }
    public double area(){
        return 3.1416*r*r;
    }
    public double Circumference(){
        return 2*3.1416*r;
    }
    void display_circle(){
        System.out.println("Circle Area is: " + area());
        System.out.println("Circumference is: " + Circumference());
        System.out.println();
    }
}

class Rectangle{
    private int w,h;
    
    public void read(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weidth: ");
        w = input.nextInt();
        System.out.print("Enter height: ");
        h = input.nextInt();    
    } 
    public double area(){
        return w*h;
    }
    public double p(){
        return 2*(w+h);
    }
    
    void display_rectangle(){
        System.out.println("Rectangle area: " +area());
        System.out.println("Perimeter : " +p());
        System.out.println();
    }    
}

class Triangle{
    private int a,b,h;
    
    public void read(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Trianlge a is: " + a);
        a = input.nextInt();
        System.out.print("Triangle b is: " + b);
        b = input.nextInt();
        System.out.print("Triangle h is: "+ h);
        h = input.nextInt();
    }
    public double area(){
        return 0.5*b*h;
    }
    public double perimeter(){
        return a+b+h;
    }
    void display_triangle(){
        System.out.println("Triangle area: " + area());
        System.out.println("Perimeter : " + perimeter());
        System.out.println();
    }
}
public class Area_perimeter {

    public static void main(String[] args) {
        
        Circle c = new Circle();
        c.read();
        c.display_circle();
        
        Rectangle r = new Rectangle();
        r.read();
        r.display_rectangle();
        
        Triangle t = new Triangle();
        t.read();
        t.display_triangle();
    }
    
}
