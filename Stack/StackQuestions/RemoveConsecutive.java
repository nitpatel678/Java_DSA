public class RemoveConsecutive {
    public static String removeRepeat(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }

        StringBuilder newString = new StringBuilder();
        newString.append(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                newString.append(str.charAt(i));
            }
        }

        return newString.toString();
    }

    public static void main(String[] args) {
        String num = "122455333770";
        System.out.println("Before removing the consecutive:");
        System.out.println(num);
        
        String result = removeRepeat(num);
        
        System.out.println("After removing the consecutive:");
        System.out.println(result);
    }
}
