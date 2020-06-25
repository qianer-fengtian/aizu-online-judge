package itp.itp1_8;

import java.io.PrintWriter;
import java.util.Scanner;

public class ITP1_8_B {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PrintWriter pw = new PrintWriter(System.out);

    while (true) {
        String s = sc.nextLine();

        if ("0".equals(s)) break;

        int ans = 0;
        for (char c : s.toCharArray()) {
            ans += Integer.valueOf(c) - 48;
        }
        pw.println(ans);
    }
    
    pw.flush();
  }
}