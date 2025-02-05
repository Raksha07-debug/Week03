package binarysearch.rotatedarray;

public class RotateArr {
    public static void main(String[] args) {
        int arr[]={15,16,2,8,10};
        int rotationIndex= findRotationIndex(arr);
        if(rotationIndex!=-1){
            System.out.println("Rotation point in a rotated array is :"+arr[rotationIndex]);
        }
        else{
            System.out.println("Array is not rotated ");
        }
    }
    public static int findRotationIndex(int arr[]){
        int left=0,right=arr.length-1;
        if(arr.length==0) return -1;
        if(arr.length==1 || arr[left]<arr[right]) return left;

        while(left<right){
            int mid=(right+left)/2;
            if(mid<right && arr[mid]>arr[mid+1]){
                return mid+1;
            }
            if(mid> left && arr[mid]<arr[mid-1]){
                return mid;
            }
            if(arr[mid]>=arr[left]){
                left=mid+1;
            }
            else{
                right=mid;
            }

        }
        return left;
    }
}
