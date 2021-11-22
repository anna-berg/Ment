package homeworkFor1411;

/**
 * Дана строка.
 * Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом. Также удалить пробелы.
 * Результат привести к верхнему регистру.
 * Например:
 * <p>
 * “abc Cpddd Dio OsfWw” -> “ABCPDIOSFW”
 */

public class Homework05_String {
    public static void main(String[] args) {
        String line = "abc Cpddd Dio OsfWw";
        String result = cleanLine(line);
        System.out.println(result);
    }

    private static String cleanLine(String line) {
        String lineClear = line.replace(" ", "");
        char[] charArray = lineClear.toUpperCase().toCharArray();
        char[] resultArray = new char[charArray.length];
        StringBuilder resultBuffered = new StringBuilder();
        String resultString = "";
        char current = ' ';
        for (char ch : charArray) {
            if (current != ch) {
                resultBuffered.append(ch);
                current = ch;
            }
        }

        return resultBuffered.toString();
    }
}
