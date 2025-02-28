import java.util.*;

public class Snake_in_Matrix {
    public static int finalPositionOfSnake(int a, List<String> s) {
        int n=0;
        int[][] arr=new int[a][a];
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                arr[i][j]=n++;
            }
            
        }
        int p1=0;
        int p2=0;
        for(String i:s){
            if(i.equals("RIGHT")){
                p2++;
            }
            else if(i.equals("LEFT")){
                p2--;
            }
            else if(i.equals("DOWN")){
                p1++;
            }
            else if(i.equals("UP")){
                p1--;
            }
        }
        return arr[p1][p2];
    }
    public static void main(String[] args) {
        int n=2;
        List<String> commands=Arrays.asList("RIGHT","DOWN");
        System.out.println(finalPositionOfSnake(n, commands));
    }
}
