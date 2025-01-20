import java.util.Arrays;

public class SwapcharactersString {
    public static void main(String[] args) {
        String str ="ABCDEFGH";
        swaping(str, 3, 4);
        
    }
    public static void swaping(String str,int c,int b){
        char[] arr = str.toCharArray();
        int N = str.length();
        c = c%N;
        char temp;
        for(int i = 0; i <b; i++ ){
            temp = arr[i];
            arr[i] = arr[(i+c)%N];
            arr[(i+c)%N] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
