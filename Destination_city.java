import java.util.Arrays;
import java.util.List;

public class Destination_city {
    public String destCity(List<List<String>> paths) {
        int l=paths.size()-1;
        String b=paths.get(0).get(1);
        for(int i=0;i<=l;i++){
            List<String> a=paths.get(i);
            for(int j=0;j<a.size();j++){
                
                if(b.equals(paths.get(i).get(0))){
                    b=paths.get(i).get(1);
                    i=0;
                    j=0;
                }
            }
        }
        return b;
    }
    public static void main(String[] args) {
        Destination_city solution = new Destination_city();

        // Test case 1
        List<List<String>> paths1 = Arrays.asList(
            Arrays.asList("London", "New York"),
            Arrays.asList("New York", "Lima"),
            Arrays.asList("Lima", "Sao Paulo")
        );

        // Test case 2
        List<List<String>> paths2 = Arrays.asList(
            Arrays.asList("B", "C"),
            Arrays.asList("D", "B"),
            Arrays.asList("C", "A")
        );

        System.out.println("Destination City (Test 1): " + solution.destCity(paths1)); 
        System.out.println("Destination City (Test 2): " + solution.destCity(paths2)); 
    }
}
