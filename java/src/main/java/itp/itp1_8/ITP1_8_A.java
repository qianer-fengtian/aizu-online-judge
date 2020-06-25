package itp.itp1_8;

import java.io.PrintWriter;
import java.util.Scanner;

public class ITP1_8_A {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PrintWriter pw = new PrintWriter(System.out);

    String s = sc.nextLine();

    for (char c : s.toCharArray()) {
        if (Character.isUpperCase(c)) {
            pw.print(Character.toLowerCase(c));
        } else {
            pw.print(Character.toUpperCase(c));
        }
    }
    pw.println();
    pw.flush();
    sc.close();
  }
}