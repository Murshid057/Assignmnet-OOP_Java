/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg01_project_user_input;
import java.util.*;

interface Meal{
   double calculateCost();
   void display_info();
}

//----------------------------StandardMeal---------------------------
class StandardMeal implements Meal{
    String name;
    double base_price;
    
    StandardMeal(String name,double base_price){
        this.name = name;
        this.base_price = base_price;
    }
    
    @Override
    public double calculateCost(){
        double price = base_price *1.2;
        return price;
    }
    
    @Override
    public void display_info(){
        System.out.println("Name is: " + name);
        System.out.println("Total Price is: " + calculateCost());
        System.out.println();
    }
}

//------------------------------ComboMela---------------------------
class ComboMeal implements Meal{
    String name;
    double base_price;
    
    ComboMeal(String name, double base_price){
        this.name = name;
        this.base_price = base_price;
    }
    
    @Override
    public double calculateCost(){
        double price = base_price * 2.5;
        return price;
    }
    
    @Override
    public void display_info(){
        System.out.println("Name is: " + name);
        System.out.println("Total Price is: " + calculateCost());
        System.out.println();
    }
}

//-------------------------------DiscountMeal----------------------------
class DiscountMeal implements Meal{
    String name;
    double base_price;
    double discountPercentage;
    
    DiscountMeal(String name, double base_price, double discountPercentage){
        this.name = name;
        this.base_price = base_price;
        this.discountPercentage = discountPercentage;
    }
    
    @Override
    public double calculateCost(){
        double price = (base_price-base_price)*discountPercentage;
        return price;
    }
    
    @Override
    public void display_info(){
        System.out.println("Name is: " + name);
        System.out.println("Total price is: " + calculateCost());
        System.out.println();
    }
}


  
public class Main {

    public static void main(String[] args) {
        
    }
    
}
