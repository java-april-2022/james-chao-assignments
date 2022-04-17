public class Gorilla extends Mammal {

    //methods for Gorilla
    
    public void throwSomething(String object){

        System.out.println("Gorilla has thrown " + object);
        this.energyLevel = this.energyLevel - 5;
    }

    public void eatBananas(){
        System.out.println("Gorilla is satisfied after eating the banana");
        this.energyLevel += 10;
    }

    public void climb(){
        System.out.println("Gorilla has climbed a tree");
        this.energyLevel -= 10;
    }

}
