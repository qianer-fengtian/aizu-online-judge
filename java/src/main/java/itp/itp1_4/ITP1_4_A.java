package itp.itp1_4;

import java.util.Scanner;

public class ITP1_4_A {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.printf("%d %d %f\n", a / b, a % b, 1.0 * a / b);
  }
}