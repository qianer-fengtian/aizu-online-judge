package itp.itp1_1;

import java.util.Scanner;

public class ITP1_1_C {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(a * b + " " + (a*2 + b*2));
    sc.close();
  }
}
