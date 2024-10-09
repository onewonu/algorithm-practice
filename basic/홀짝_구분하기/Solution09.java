package basic.홀짝_구분하기;

import java.util.Scanner;

public class Solution09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String result = (n % 2 == 0) ? "even" : "odd";
        System.out.printf("%d is %s", n, result);
    }
}