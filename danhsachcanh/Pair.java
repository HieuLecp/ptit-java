package danhsachcanh;

import java.util.*;

public class Pair<K,V> {

  private K num1;
  private V num2;

  public Pair() {
  }

  public Pair(K num1, V num2) {
    this.num1 = num1;
    this.num2 = num2;
  }

  public boolean isPrime() {
    int a = (Integer) num1;
    int b = (Integer) num2;
    if (check(a) && check(b)) {
      return true;
    }
    return false;
  }

  private static boolean check(int a) {
    if (a == 2) return true;
    if (a < 2 || a % 2 == 0) return false;
    for (int i = 3; i <= Math.sqrt(a);i+=2){
      if (a % i == 0) return false;
    }  
    return true;
  }

  @Override
  public String toString() {
//    return num1+" " +num2; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    return "(" + num1 + "," + num2 + ")";
  }
  
}