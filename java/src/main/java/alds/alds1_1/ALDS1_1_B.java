package alds.alds1_1;

import java.util.Scanner;

public class ALDS1_1_B {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long x = sc.nextLong();
    long y = sc.nextLong();

    System.out.println(gcd(x, y));
//    System.out.println(gcd2(x, y));
}

//   public static long gcd(long x, long y) {
//     while (x != y) {
//         System.out.println("x: " + x + ", y:" + y);
//         if (x > y) {
//             x -= y;
//         } else {
//             y -= x;
//         }
//     }
//     return x;
//   }
  
  public static long gcd(long x, long y) {
      if (x < y) {
          long tmp = x;
          x = y;
          y = tmp;
      }

      while (y > 0) {
          long r = x % y;
          x = y;
          y = r;
      }
      return x;
  }

}