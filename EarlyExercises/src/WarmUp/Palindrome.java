package WarmUp;

public class Palindrome {

    public static boolean isPalindrome(String input) {
        StringBuilder reverseWord = new StringBuilder();

        for (int i = input.length()-1; i > -1; i--) {
            reverseWord.append(input.charAt(i));
        }
        String reversedWord = new String(reverseWord);
        return input.equalsIgnoreCase(reversedWord);
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome("23532"));
    }
}
