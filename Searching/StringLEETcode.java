public class StringLEETcode {
    public static void main(String[] args) {
        String str = "aaabbbbbcccccddddddeeeeeeffff";
        String ans = "" + str.charAt(0);
        int no = 1;
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);
            if (curr == prev) {
                no += 1;
            } else {
                if (no > 1) {
                    ans += no;
                }

                no = 1;
                ans += curr;
            }
        }
        ans += no;
        System.out.println(ans);
    }
}