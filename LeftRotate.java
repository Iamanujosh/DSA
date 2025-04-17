import java.util.*;
public class LeftRotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotate(arr,3);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] arr, int k){
        int n = arr.length;
        k = k % n;

        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }

    public static void reverse(int[] arr, int s, int e){
        while(s < e){
            swap(arr,s,e);
            s++;
            e--;
        }
    }

    public static void swap(int[] arr, int s, int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}