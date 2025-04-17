import java.util.*;
public class MoveZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void  moveZeroes(int[] nums) {
        int n = nums.length;
        int j = -1;
        for(int i = 0; i<n; i++){
            if(nums[i] == 0){
                j = i;
                break;
            }
        }
        for(int i = j+1; i<n; i++){
            if(nums[i] != 0){
                swap(nums, i,j);
                j++;
            }
        }
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
