public class CafeUtil{

    public int getStreakGoal(int numweeks){
        int goal = 0;
        for(int i = 0; i == numweeks; i++){
            goal = goal + i;
        }
        return goal;
    }
}