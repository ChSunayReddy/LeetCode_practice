import java.util.Arrays;
import java.util.HashMap;

public class Find_the_Number_of_Distinct_colors_among_the_balls{
    public static int[] queryResults(int limit, int[][] queries) {
        int[] re=new int[queries.length];
        int k=0;
        HashMap<Integer,Integer> h1=new HashMap<>();
        HashMap<Integer,Integer> s=new HashMap<>();
        for (int[] query:queries){
            int ball=query[0];
            int color=query[1];
            if(h1.containsKey(ball)){
                int oldcolor=h1.get(ball);
                s.put(oldcolor, s.get(oldcolor)-1);
                if(s.get(oldcolor)==0){
                    s.remove(oldcolor);
                }
            }
            h1.put(ball,color);
            s.put(color,s.getOrDefault(color, 0)+1);
            re[k++]=s.size();
        }
        return re;
    }
    public static void main(String[] args) {
        int[][] queries={{1,4},{2,5},{1,3},{3,4}};
        int limit=4;
        System.out.println(Arrays.toString(queryResults(limit, queries)));
    }
}