package alds.alds1_5;

import java.util.Scanner;

public class ALDS1_5_C {

    private static class Point {
        double x = 0;
        double y = 0;
        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return String.format("%.5f %.5f", x, y);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Point min = new Point(0, 0);
        Point max = new Point(100, 0);

        System.out.println(min);
        koch(min, max, n);
        System.out.println(max);
    }

    private static void koch(Point min, Point max, int n) {
        if (n == 0) return;
        // 2 18
        // 4+18=22 22/3 = 7.3
        //
        double sx = (2*min.x+1*max.x) / 3;
        double sy = (2*min.y+1*max.y) / 3;
        Point s = new Point(sx, sy);

        double tx = (1*min.x+2*max.x) / 3;
        double ty = (1*min.y+2*max.y) / 3;
        Point t = new Point(tx, ty);

        double rad = Math.toRadians(60);
        double ux = (tx-sx)*Math.cos(rad) - (ty-sy)*Math.sin(rad)+sx;
        double uy = (tx-sx)*Math.sin(rad) + (ty-sy)*Math.cos(rad)+sy;
        Point u = new Point(ux, uy);

        koch(min, s, n-1);
        System.out.println(s);
        koch(s, u, n-1);
        System.out.println(u);
        koch(u, t, n-1);
        System.out.println(t);
        koch(t, max, n-1);
    }
}
