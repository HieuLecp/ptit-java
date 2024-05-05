package java.bai4;
import java.util.*;
import java.io.*;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args)  throws FileNotFoundException {
        Scanner sc= new Scanner(new File("INSTUTION.in"));
        HashMap<String, Truong> mapTruong= new HashMap<>();
        int n= Integer.parseInt(sc.nextLine());
        for(int i=0; i<n; ++i){
            Truong x= new Truong(sc.next(), sc.nextLine().trim());
            mapTruong.put(x.getMa(), x);
        }
        sc= new Scanner(new File("REGISTER.in"));
        ArrayList<Doi> arr= new ArrayList<>();
        n= Integer.parseInt(sc.nextLine());
        for(int i=0; i< n; ++i){
            Truong x= mapTruong.get(sc.next());
            int m= Integer.parseInt(sc.nextLine().trim());
            for(int j=0; j<m; ++j){
                arr.add(new Doi(sc.nextLine(), x));
            }
        }
        Collections.sort(arr);
        for(int i=0; i<arr.size(); ++i){
            System.out.println(String.format("team%02d", i+1) + " " + arr.get(i));
        }
    }
}
