package itp.itp1_2;

import java.util.Scanner;

public class ITP1_2_B {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    System.out.println(a < b && b < c ? "Yes" : "No");

    sc.close();
  }
}