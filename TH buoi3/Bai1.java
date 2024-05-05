
import java.util.*;
public class Bai1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- >0){
            int n= sc.nextInt();
            HashSet<Integer> even1= new HashSet<>();
            HashSet<Integer> odd1= new HashSet<>();
            for(int i=0; i<n; i++){
                int x= sc.nextInt();
                if(x%2 == 0)
                    even1.add(x);
                else
                    odd1.add(x);
            }
            List<Integer> even2= new ArrayList<>(even1);
            List<Integer> odd2= new ArrayList<>(odd1);
            Collections.sort(even2);
            Collections.sort(odd2, Collections.reverseOrder());
            for(int i=0; i<even2.size(); i++){
                System.out.print(even2.get(i) + " ");
            }
            System.out.println();
            for(int i=0; i<odd2.size(); i++){
                System.out.print(odd2.get(i) + " ");
            }
            System.out.println();
        }
    }
}
