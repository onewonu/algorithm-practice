package basic.특수문자_출력하기;

public class Solution05 {
    public static void main(String[] args) {
        char[] chars = {
                '!'
                , '@'
                , '#'
                , '$'
                , '%'
                , '^'
                , '&'
                , '*'
                , '('
                , '\\'
                , '\''
                , '\"'
                , '<'
                , '>'
                , '?'
                , ':'
                , ';'
        };

        StringBuilder result = new StringBuilder();
        for (char printChars : chars) {
            result.append(printChars);
        }

        System.out.print(result);
    }
}