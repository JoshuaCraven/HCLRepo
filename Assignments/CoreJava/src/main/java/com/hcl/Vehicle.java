import java.util.*;
class  Vehicle
{
    int no;
    String model;
    String manufacturer;
    String color;

    Vehicle(int no,String model,String manufacturer,String color){
        this.no=no;
        this.model=model;
        this.manufacturer=manufacturer;
        this.color=color;
    }

    public class Truck extends Vehicle{
        int capacity;
        Truck(int no,String model,String manufacturer,String color,int capacity){
        super( no, model, manufacturer, color);
        this.capacity=capacity;
        }
    
    void show(){
      System.out.println("No = " + no);
      System.out.println("Model = " + model);
      System.out.println("manufacturer = " + manufacturer);
      System.out.println("Color = " + color);
      System.out.println("Capacity = " + capacity);
    }
    }
    public static void main(String[] args) 
    {
    Scanner input=new Scanner(System.in);
    System.out.println("Truck No: ");
    int no=input.nextInt();

    System.out.println("Model: ");
    String model=input.next();

    System.out.println("Manufacturer: ");
    String manufacturer=input.next();

    System.out.println("Color: ");
    String color=input.next();

    System.out.println("Loading Capacity: ");
    int cap=input.nextInt();

        Truck t=new Truck(no,model,manufacturer,color,cap);
        System.out.println("****Truck Details****");
        System.out.println();
        t.show();
    }
}
