public class Bat extends Mammal {
    public Bat() {
        this.energyLevel = 300; 
    }


    public void fly() {
        this.energyLevel -= 50;
        System.out.println("The bat is swarming around," + this.energyLevel);
    }
    public void eatHumans() {
        this.energyLevel += 25;
        System.out.println("The Bat is Eating Humans" + this.energyLevel);
    }

    public void attackTown() {
        this.energyLevel -= 100;
        System.out.println("The bat is engaging in an attack on the town" + this.energyLevel);
    }



}
