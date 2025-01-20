
public class FreqOfChar {
    public static void main(String[] args) {
        String str = "aabssd";
        int[] arr = new int[str.length()];
        for(int i =0; i<str.length(); i++){
            for(int j = 0; j<str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    arr[i] = arr[i]+1;
                }
            }
        }
        String temp = "";
        for(int i = 0; i<str.length(); i++){
            String s = String.valueOf(str.charAt(i));
            if(!temp.contains(s)){
                temp += s;
                String result = s+arr[str.indexOf(s)];
                System.out.print(result);
            }
        }
        
    }
}
