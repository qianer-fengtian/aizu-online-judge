package itp.itp1_8;

import java.util.Scanner;

public class ITP1_8_D {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.nextLine();
    String p = sc.nextLine();

    System.out.println((s + s).contains(p) ? "Yes" : "No");
  }
}