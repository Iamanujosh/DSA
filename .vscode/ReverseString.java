public class ReverseString {
    public static void main(String[] args) {
        String str = "anushka shridhar joshi";
        System.out.println(leftRotation(str,2));
       System.out.println(rightRotation(str,2));
    }

    public static String leftRotation(String str, int d){
        String rotate = str.substring(d) + str.substring(0,d);
        return rotate;
    }

    public static String rightRotation(String str, int d){
        String rotate = leftRotation(str, str.length()-d);
        return rotate;
    }
}
