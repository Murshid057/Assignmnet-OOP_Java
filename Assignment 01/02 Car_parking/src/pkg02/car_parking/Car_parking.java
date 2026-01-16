/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg02.car_parking;

class CarPark{
    private int carid, charge;
    private float parkedtime;
    
              //car_id
    public int getCarid() {
        return carid;
    }
    public void setCarid(int carid) {
        this.carid = carid;
    }
    
               //Charge
    public int getCharge() {
        return charge;
    }
    public void setCharge(int charge) {
        this.charge = charge;
    }
              //Parked_time
    public float getParked_time() {
        return parkedtime;
    }
    public void setParked_time(float parkedtime) {
        this.parkedtime = parkedtime;
    }
    
    void display(){
        System.out.println("Car id is  : " + getCarid());
        System.out.println("Car Charge : " + getCharge()+"%");
        System.out.println("Parked_time is: " + getParked_time());
    }
    
}
public class Car_parking {

    public static void main(String[] args) {
        
        CarPark c = new CarPark();
        c.setCarid(29);
        c.setCharge(70);
        c.setParked_time(6.3f);
        
        c.display();
//        System.out.println("Car id is  : " + c.getCarid());
//        System.out.println("Car Charge : " + c.getCharge()+"%");
//        System.out.println("Parked_time is: " + c.getParked_time());

    }
    
}
