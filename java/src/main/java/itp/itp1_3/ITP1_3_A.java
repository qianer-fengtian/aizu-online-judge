package itp.itp1_3;

import java.io.PrintWriter;

public class ITP1_3_A {

  public static void main(String[] args) {
      try (PrintWriter pw = new PrintWriter(System.out)) {
        for (int i = 0; i < 1000; i++) {
            pw.append("Hello World\n");
        }
        pw.flush();
      }
  }
}