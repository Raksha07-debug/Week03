package linearsearch.firstnegative;

public class Negative {
    public static void main(String[] args) {
        int arr[]= {2,3,-5,1,-9,2};
        System.out.println("the first negative element: "+search(arr));

    }
    public static int search(int arr[]){
        for(int i=0; i<arr.length; i++){
            if(arr[i]<0)
                return arr[i];
        }
        return -1;
    }
}
