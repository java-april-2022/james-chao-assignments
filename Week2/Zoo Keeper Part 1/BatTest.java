public class BatTest {
    public static void main(String[] args) {
        Bat crayBat = new Bat();
        
        for(int i = 0; i < 3; i++){
            crayBat.attackTown();
        }
        crayBat.eatHumans();
        crayBat.eatHumans();
        crayBat.fly();
        crayBat.fly();
    }
}
