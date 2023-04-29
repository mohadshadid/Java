public class BatTest {
    public static void main(String[] args) {
        Bat batman = new Bat();
        
        batman.attackTown(); 
        batman.attackTown(); 
        batman.attackTown(); 

        batman.eatHumans(); 
        batman.eatHumans(); 

        batman.fly(); 
        batman.fly(); 

        System.out.println("The energy level of this mammal is:" + batman.displayEnergy());
    }
}
