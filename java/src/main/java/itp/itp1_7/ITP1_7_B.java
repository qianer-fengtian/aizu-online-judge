package itp.itp1_7;

import java.io.PrintWriter;
import java.util.Scanner;

public class ITP1_7_B {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PrintWriter pw = new PrintWriter(System.out);

    while (true) {
        int n = sc.nextInt();
        int x = sc.nextInt();

        if (n == 0 && x == 0) break;

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i+1; j <= n; j++) {
                for (int k = j+1; k <= n; k++) {
                    if (i + j + k == x) ans++;
                }
            }
        }
        pw.println(ans);
    }

    pw.flush();
    sc.close();
  }
}