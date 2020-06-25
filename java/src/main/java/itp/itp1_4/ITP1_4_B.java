package itp.itp1_4;

import java.util.Scanner;

public class ITP1_4_B {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double r = sc.nextDouble();

    System.out.printf("%f %f", Math.PI * r * r, 2 * Math.PI * r);
  }
}