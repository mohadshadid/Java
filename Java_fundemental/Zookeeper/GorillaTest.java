public class GorillaTest {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();

        gorilla.throwSomething(); 
        gorilla.throwSomething();
        gorilla.throwSomething();

        gorilla.eatBananas(); 
        gorilla.eatBananas();

        gorilla.climb(); 

        System.out.println("The Energy level for this Mammal is:" + gorilla.displayEnergy());
        
    }
}
