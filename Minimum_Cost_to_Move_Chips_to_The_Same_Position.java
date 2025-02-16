public class Minimum_Cost_to_Move_Chips_to_The_Same_Position {
    public static int minCostToMoveChips(int[] position) {
        int o=0,e=0;
        for(int i:position){
            if(i%2==0) e++;
            else o++;
        }
        return Math.min(o,e);
    }
    public static void main(String[] args) {
        int[] pos={1,2,3};
        System.out.println(minCostToMoveChips(pos));
    }
}
