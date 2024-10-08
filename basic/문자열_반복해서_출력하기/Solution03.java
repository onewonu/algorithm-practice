package basic.문자열_반복해서_출력하기;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        IntStream.range(0, n).forEach(i -> System.out.print(str));
    }
}