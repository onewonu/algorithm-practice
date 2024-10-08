package basic.대소문자_바꿔서_출력하기;

import java.util.Scanner;

public class Solution04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        StringBuilder stringBuilder = new StringBuilder();
        input.chars().forEach(c -> stringBuilder.append(toggleCase((char) c)));
        System.out.print(stringBuilder);
    }

    public static char toggleCase(char c) {
        return Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c);
    }
}