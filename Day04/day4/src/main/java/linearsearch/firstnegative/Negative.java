package linearsearch.firstnegative;

public class Negative {
    public static void main(String[] args) {
        int arr[]={7,4,3,8,-5,1,-2};
        System.out.println("first occurence of a negative number "+search(arr));

    }
    public static int search(int arr[]){
        for(int i=0; i<arr.length; i++){
            if(arr[i]<0){
                return arr[i];
            }
        }
        return -1;
    }
}
