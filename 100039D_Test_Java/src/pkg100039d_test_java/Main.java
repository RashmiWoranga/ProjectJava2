/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg100039d_test_java;

/**
 *
 * @author RashmiWoranga
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Car Poche = new Car(false,300,"Poche","6FF-234G");
        Poche.show();
        
    }
}
class Vehicle{
    private String name;
    private String Brand;
    private String vehicleNum;
    private int numOfWheels;

   public Vehicle(String nm,String brand,String vNum,int wheels){
       this.Brand = brand;
       this.name = nm;
       this.vehicleNum = vNum;
       this.numOfWheels = wheels;
   }

    public String getBrand() {
        return Brand;
    }

    public String getName() {
        return name;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public String getVehicleNum() {
        return vehicleNum;
    }
    
}
class Car extends Vehicle{
    
    private boolean isRoofAvailable;
    private int maxSpeed;
    
    public Car(boolean roof, int speed,String brnd,String vNum){
        super("Car",brnd,vNum,4);
        this.isRoofAvailable = roof;
        this.maxSpeed = speed;
    
    }
    public void show(){
        System.out.println("Your Car is "+this.getVehicleNum()+" "+ this.getBrand() + " and high speed is "+this.getMaxSpeed()+" mph.");
    }
    public boolean isIsRoofAvailable() {
        return isRoofAvailable;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    
    
    
}