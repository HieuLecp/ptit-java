package danhsachcanh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] a = new int[n][n];
    List<Pair<Integer,Integer>> res = new ArrayList<>();
    for (int i = 0 ; i < n; i++){
      for(int j = 0 ; j < n;j++) {
        a[i][j] = sc.nextInt();
        if (a[i][j] == 1 && i < j){
          Pair<Integer ,Integer> pair = new Pair<>(i + 1, j + 1);
          res.add(pair);
        }
      }
    }
    for (Pair<Integer,Integer> p : res){
      System.out.println(p);
    }
  }
}
