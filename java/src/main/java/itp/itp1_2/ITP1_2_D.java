package itp.itp1_2;

import java.util.Scanner;

public class ITP1_2_D {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int W = sc.nextInt();
    int H = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    int r = sc.nextInt();
    sc.close();

    if (0 <= x - r && x + r <= W && 0 <= y - r && y + r <= H) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}