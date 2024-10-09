package basic.덧셈식_출력하기;

import java.util.Scanner;

public class Solution06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;

        System.out.printf("%d + %d = %d", a, b, sum);
    }
}