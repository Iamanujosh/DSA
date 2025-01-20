import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class rogh {
    public static void main(String[] args) {
        
        int[] arr1 ={970, 50, 976, 138, 224, 401, 318, 942, 787, 27, 659, 843, 489, 881, 580, 538, 134, 816, 565, 389, 42, 537, 602, 188, 354, 136, 309, 4, 825, 911, 871 ,425, 745, 388, 780, 29, 604, 248, 266, 186 ,880, 249, 371, 20, 834, 514, 284, 491, 18, 361, 141, 632, 232, 58, 521, 613, 381, 114, 72, 442, 606, 751, 28, 485, 292 ,526, 56, 801, 79 ,300, 136};
        int[] arr2 = {219, 804, 681, 876, 9, 188, 658, 383, 547, 495, 342, 688, 423, 225, 988, 926, 0, 204, 811, 49, 830, 526, 265, 727, 228, 869, 192, 740, 142, 8, 134, 390, 217, 223, 220, 448, 95, 950, 769, 700, 659, 902, 248, 399, 307, 652, 623, 263, 36, 414, 729, 152, 857, 643, 479, 928, 39, 123, 98, 352, 915, 831};
        // rotate(arr);
        // String str ="anushka";
        // System.out.println(reverseWord(str));
        // segregate0and1(arr, 5);
        // sort012(arr, 6);
        //segregateElements(arr,8);
        System.out.println(doUnion(arr1, arr2));

    }
    public static boolean isPresent(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                return true;
            }
        }
        return false;
    }
    
    public static int doUnion(int arr1[], int arr2[]) {
    // Use a HashSet to store unique elements
    Set<Integer> unionSet = new HashSet<>();
    
    // Add all elements from arr1 to unionSet
    for (int num : arr1) {
        unionSet.add(num);
    }
    
    // Add all elements from arr2 to unionSet
    for (int num : arr2) {
        unionSet.add(num);
    }
    
    // The size of unionSet gives us the count of unique elements
    return unionSet.size();
}

    
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
       
       Arrays.sort(arr);
       int minVal = arr[k-1];
       return minVal;
    } 

    public static void segregateElements(int arr[], int n) {
        Arrays.sort(arr);
        int start = 0, end = arr.length - 1, temp=0;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void reverse(int[] arr, int start,int end){
        int temp;
        while(start < end){
            temp = arr[start];
            arr[start] =  arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void rotate(int[] arr) {
        int d =1;
        int n =arr.length;
        reverse(arr,0,n-1);
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);

    }
            
    public static String reverseWord(String str)
    {
        char[] ch = str.toCharArray();
        char temp;
        int start = 0 , end = 6;
        while(start < end){
            temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        String result = new String(ch);
        return result;
    }
    public static void segregate0and1(int[] arr, int n) {
        int c1 = 0 , count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                arr[count++] = 0;
            }
            else if(arr[i] == 1){
                c1++;
            }
        }
        for(int i = count; i < count+c1; i++){
            arr[i] = 1;
        }
        for(int i = count+c1+1; i < n; i++){
            arr[i] = 2;
        }
       System.out.println(Arrays.toString(arr));
    }
    // public static void sort012(int a[], int n)
    // {
    //    int max0 = 0, max1 = 0, max2 = 0;
    //    for(int i = 0; i < n; i++){
    //        if(a[i] == 0){
    //            a[max0++] = 0;
    //        }
    //        else if(a[i] == 1){
    //            max1++;
    //        }
    //        else{
    //         max2++;
    //        }
        
    //    }
    //    for(int i = max0; i < max0 + max1; i++){
    //     a[i] = 1;
    // }
    
    // for(int i = max0+max1; i < n; i++){
    //     a[i] = 2;
    // }
    // System.out.println(Arrays.toString(a));
    // }
        
}

   
