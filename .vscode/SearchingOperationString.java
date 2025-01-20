/**
 * SearchingOperationString
 */
public class SearchingOperationString {

    public static void main(String[] args) {
        String str = "anushka shridhar joshi";
        charFinding(str);
        matchingString(str);
    }

    public static void charFinding(String str){

        System.out.println("Index of A: "+str.indexOf("a"));
        System.out.println("Index of a from last: "+str.lastIndexOf("a"));
        System.out.println("Index of a from starting from 4th index"+str.indexOf("a", 3));
        System.out.println("Index of a from starting from 4th last index"+str.lastIndexOf("a", 3));
    }

    public static void matchingString(String str){
        System.out.println("Checking whether string is starting with anushka or not: "+str.startsWith("anushka",0));
        System.out.println("Checking whether string is ends with anushka or not: "+str.endsWith("anushka"));

    }
}