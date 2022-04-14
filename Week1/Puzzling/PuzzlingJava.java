import java.util.Random;
import java.util.ArrayList;


public class PuzzlingJava {
    // public int[] getTenRolls(){
    //     int[] tenRolls = new int[10];
    //     for(int i = 0; i < tenRolls.length; i++){
    //         Random randGen = new Random();
    //         int randomNum = randGen.nextInt((10-0)+1)+10;
    //         tenRolls[i] = randomNum;
    //     }
    //     return tenRolls;
    // }
    public ArrayList<Integer> getTenRolls() {

        ArrayList<Integer> randomGen = new ArrayList<Integer>();
        Random rand = new Random();

        for (int i = 1; i <=10; i++) {
            randomGen.add(rand.nextInt(20) + 1);
        }

        return randomGen;
    }
}
