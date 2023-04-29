public class Gorilla extends Mammal {

    public void throwSomething() {
        this.energyLevel -= 5;
        System.out.println("Something has been thrown by the gorilla! Energy Level -5 :<(" + this.energyLevel);
        

    }

    public void eatBananas() {
        this.energyLevel += 10;
        System.out.println(
                "The gorilla is currently eating a banana and appears to be very satisfied, Energy Level: " + this.energyLevel);
    }

    public void climb() {
        this.energyLevel -= 10;
        System.out.println("A tree is being climbed by the gorilla, Energy level " + this.energyLevel);
    }
}
