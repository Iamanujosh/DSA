//Line -02 Main function 
//Line -15 Searching numbers
//Line -40 Searching char
//Line -57 find in range
//Line -72 find minimum
//Line -117 2d array search
//Line -133 max min 2d array
//Line -154 even digit problem
//maximum wealth problem
public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = {12, 45, 67, -16, 34, 60};
        System.out.println(evenDigits(arr));
        // int target = -1;
        // boolean ans = searchElement(arr, target);
        // System.out.println(target +" is present in array ? :"+ans);

        // String name = "anushkajoshi";
        // char target2 = 'j';
        // boolean ans2 = stringSearch(name, target2);
        // System.out.println(target2 +" is present in array ? :"+ans2);

        // System.out.println("Mininmun: " + minmaxSearch(arr)[0] + " Maximum: " + minmaxSearch(arr)[1]);

        // int[][] arr = {
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // };

        // int target = 5;
        // int[] ans = search2D(arr, target);
        // System.out.println("Element found at row: "+ans[0]+" and column: "+ans[1]);

        // int[] ans = minmax2D(arr);
        // System.out.println("Mnimum Element: "+ans[0]+" and Maximum Element: "+ans[1]);

        
    }
//function for searching element linearly
//Boolean function
   public static boolean searchElement(int[] arr,int target){

        //checking if array is empty or not
        if(arr.length == 0){
            return false;
        }

        //using for each loop for iterating linearly
        for(int element: arr){

            if(element == target){
                return true;
            }
        }
        return false;
    }

      
//searching in String
public static boolean stringSearch(String name,char target){
    if(name.length() == 0){
        return false;
    }

    for(char element : name.toCharArray()){
        if(element == target){
            return true;
        }
    }

    return false;
}

//Finding in range
public static boolean rangeSearch(int[] arr, int target, int start, int end){

    if(arr.length == 0){
        return false;
    }

    for(int index = start-1; index < end-1; index++){
        if(arr[index] == target){
            return true;
        }
    }

    return false;
}

//finding minimum and maximum
public static int[] minmaxSearch(int[] arr){
    //assme array is not empty

   int min = arr[0];
   int max = arr[0];

   for(int i = 0; i < arr.length; i++){
    if(arr[i] < min){
        min = arr[i];
    }

    if (arr[i] > max) {
        max = arr[i];  
    }
   }

   int[] ans = {min,max};

    return ans;
    
} 

//Finding variable in 2D array
public static int[] search2D(int[][] arr,int target) {
    
    for(int row = 0; row<arr.length; row++){
        for(int col = 0; col<arr[row].length; col++){
            if(arr[row][col] == target){
                return new int[] {row,col};
            }

        }
    }

    return new int[] {-1,-1};
}

//Finding maximum and minimum in 2d array

public static int[] minmax2D(int[][] arr){

    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    for(int[] rows: arr){
        for(int element: rows){
            if(element < min){
                min = element;
            }

            if(element > max){
                max = element;
            }
        }
    }

    return new int[] {min,max};
}

//Finding even number of digits in array {12,123,1245} => 2
public static int evenDigits(int[] arr) {
    int count = 0;

    for(int element: arr){
        if(even(element)){
            count++;
        }
    }

    return count;
}

//this function return true if number has even number of digits
public static boolean even(int num) {
    return digit(num) % 2 == 0;
}

public static int digit(int num) {
    num = (num < 0) ? num * -1 : num;
    return (int)(Math.log10(num) + 1);    
}
}



