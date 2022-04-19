
public class Main {
    public static void main(String[] args){
        String strng = "chruschtschov";
        System.out.println(solve(strng));
    }

    public static int solve(final String s) {
        String[] words = s.split("[aeiou]");

        int mx = 0;

        for(String word : words) {
            int n = 0;
            for (char c : word.toCharArray()) {
                n += 1 + c - 'a';
            }
            if (n > mx) {
                mx = n;
            }
        }

        return mx;
    }

}
