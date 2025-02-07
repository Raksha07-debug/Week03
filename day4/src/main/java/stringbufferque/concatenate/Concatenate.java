package stringbufferque.concatenate;

import java.util.Scanner;

public class Concatenate {
    public static  String concatString(String str[],int size){
        StringBuffer sb= new StringBuffer();
        for(int i=0; i<size; i++){
            sb.append(str[i]);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of an array ");
        int size=sc.nextInt();
        String str[]= new String[size];
        for(int i=0; i<size; i++){
            str[i]=sc.next();
        }
        System.out.println("result "+concatString(str,size));

    }

}
