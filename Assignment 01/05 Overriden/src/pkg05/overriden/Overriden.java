/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg05.overriden;

class Animal{
    public void sound(){
        System.out.println("Animal Sound----");
    }
}
class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Dog Sound : bow bow");
    }
}
public class Overriden {

    public static void main(String[] args) {
        
        Animal a = new Animal();
        a.sound();
        
        a = new Dog();
        a.sound();
    }
    
}
