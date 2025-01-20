//Line -02 Main function 
//Line -15 Searching numbers
//Line -40 Searching char
//Line -57 find in range
//Line -72 find minimum
public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = {12, 45, 67, -1, 34, 60};
        int target = -1;
        boolean ans = searchElement(arr, target);
        System.out.println(target +" is present in array ? :"+ans);

        String name = "anushkajoshi";
        char target2 = 'j';
        boolean ans2 = stringSearch(name, target2);
        System.out.println(target2 +" is present in array ? :"+ans2);

        System.out.println("Mininmun: " + minmaxSearch(arr)[0] + " Maximum: " + minmaxSearch(arr)[1]);

        
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
}

