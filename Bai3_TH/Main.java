package java.Bai3_TH;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc= new Scanner(new File("MATRIX.in"));
        int t= sc.nextInt();
        while(t-- >0){
            int n= sc.nextInt(), m=sc.nextInt(), k=sc.nextInt();
            int[] arr= new int[n * m +5];
            for(int i=0; i<n * m; i++){
                arr[i] = sc.nextInt();
            }
            Matrix x = new Matrix(n, m, arr);
            x.update(k - 1);
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    System.out.print(x.getMatrix()[i][j] + " ");
                }
                System.out.println("");
            }
        }
    }
}
