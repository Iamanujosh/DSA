import java.util.Arrays;

public class Dutch {

    public static void main(String[] args) {
        int[] arr ={0, 1, 0, 1, 1, 1 };
        segregate0And12(arr);
        
    }

    public static void swap(int[] arr, int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    public static void segregate0And12(int[] arr){
        int low = 0, mid = 0 , high = arr.length -1;

        while(mid <= high){
            if(arr[mid] == 0){
                swap(arr,mid,low);
                mid++;
                low++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
