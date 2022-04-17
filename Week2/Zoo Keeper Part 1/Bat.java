public class Bat extends Mammal {
    
    
    int energyLevel = 300;

    // Bat methods
    public void fly(){
        System.out.println("Whoosh Whoosh");
        this.energyLevel -= 50;
        System.out.println("Energy level is " + this.energyLevel);
    }

    public void eatHumans(){
        System.out.println("Unfortunately the bat was hungry and yep");
        this.energyLevel += 25;
        System.out.println("Energy level is " + this.energyLevel);
    }

    public void attackTown(){
        System.out.println("PShhhhh fire");
        this.energyLevel -= 100;
        System.out.println("Energy level is " + this.energyLevel);
    }
}
