
public class Question2 {
    public static void Subsets(String str, String ans, int i) {
        if (str.length() == i) {
            if (ans.length() == 0) {
                System.out.print("null" + " ");

            } else {
                System.out.print(ans + " ");
            }
            return;
        }

        Subsets(str, ans + str.charAt(i), i + 1);

        Subsets(str, ans, i + 1);
    }

    public static void main(String[] args) {
        String str = "abc";

        Subsets(str, "", 0);
    }
}
