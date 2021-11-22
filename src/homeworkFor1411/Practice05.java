package homeworkFor1411;

/**
 * Проверить, является ли введённая строка палиндромом, т.е. читается одинаково в обоих направлениях
 * */

public class Practice05 {
    public static void main(String[] args) {
        String line = "anna";
        String reversed = reverse(line);
        System.out.println(reversed);
        System.out.println(ifPolyndromic(line));
    }

    private static boolean ifPolyndromic(String line) {
        String reversed = reverse(line);
        if (reversed.equals(line)){
            return true;
        } else return false;
    }

    private static String reverse(String line) {
        char[] lineArray = line.toCharArray();
        StringBuilder reversedLine = new StringBuilder();
        for (int i = lineArray.length-1; i >= 0 ; i--) {
            reversedLine.append(lineArray[i]);
        }

        return reversedLine.toString();
    }

    public static boolean isPalindrome(String value) {
        String withoutSpaceValue = value.replace(" ", "");
        return new StringBuilder(withoutSpaceValue).reverse().toString().equalsIgnoreCase(withoutSpaceValue);
    }
}
