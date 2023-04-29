public class Driver extends Car {
    public void drive(){
        System.out.println("You drive the car.");
        gas--;
        status();
    }

    public void boost(){
        System.out.println("You use the boosters.");
        gas-=3;
        status();
    }

    public void refuel(){
        System.out.println("You refuel.");
        gas+=2;
        status();
    }
}