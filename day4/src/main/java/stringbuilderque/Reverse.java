package stringbuilderque;
import  java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your string ");
        String str = sc.next();
        System.out.println("original string " + str);
        System.out.println("reversed string " + reverseString(str));

    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();


    }
}
