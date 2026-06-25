public class CommonChar {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";

        System.out.print("Common Characters: ");

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);

            if (s2.indexOf(ch) != -1 && s1.indexOf(ch) == i)
                System.out.print(ch + " ");
        }
    }
}