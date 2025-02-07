package removeduplicate;

import java.util.HashSet;
import java.util.Scanner;
import java.lang.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string ");
        String str=sc.next();
        System.out.println("string without duplicates "+removeDuplicate(str));

    }
    public static String removeDuplicate(String str){
        HashSet<Character>  set= new HashSet<>();
        StringBuilder sb= new StringBuilder();
        for(char c:str.toCharArray()){
            if(!set.contains(c)){
                sb.append(c);
                set.add(c);
            }
        }
        return sb.toString();
    }

}
