package java.Bai3_TH;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class Matrix {
    private int hang, cot;
    private int[][] a;

    public Matrix(int hang, int cot, int[] arr){
        this.hang= hang;
        this.cot = cot;
        int cnt=0;
        a= new int[hang][cot];
        for(int i=0; i<hang; i++){
            for(int j=0; j<cot; j++){
                a[i][j] = arr[cnt];
                ++cnt;
            }
        }
    }

    public ArrayList<Integer> getCot(int i){
        ArrayList<Integer> list = new ArrayList<>();
        for(int j=0; j<hang; j++){
            list.add(a[j][i]);
        }
        Collections.sort(list);
        return list;
    }

    public void update(int i){
        ArrayList<Integer> arr = this.getCot(i);
        for(int j=0; j<hang; j++){
            this.a[j][i] = arr.get(j);
        }
    }

    public int[][] getMatrix(){
        return this.a;
    }
}
