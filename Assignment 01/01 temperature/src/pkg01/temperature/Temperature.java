/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg01.temperature;

class Celsius{
    public double celsius;
    
    Celsius(double c){
        celsius = c;
    }
    
    public double display_fahrenheit(){
        return (9/5*celsius)+32;
    }
}

class Fahrenheit{
    private double fahrenheit;
    
    Fahrenheit(double fahrenheit){
        this.fahrenheit = fahrenheit;
    }
    
    public double display_celsius(){
        return (fahrenheit-32)*5/9;
    }
}

public class Temperature {

    public static void main(String[] args) {
        
        Celsius c = new Celsius(20);
        System.out.println("Fahrenheit: " + c.display_fahrenheit()+" F");
        
        Fahrenheit f = new Fahrenheit(50);
        System.out.println("Celsius: " + f.display_celsius()+" C");
    }
    
}
