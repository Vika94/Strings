import static java.lang.String.format;

public class TextFormatter {

    public static String[] getSentencesFromText(String text) {
        String[] sentences = text.split("[.]");
        System.out.println("Количество предложений в тексте " + sentences.length);
        return sentences;
    }

    public static void countWords(String[] str) {
        System.out.println("Условие выполняется для следующих предложений ");
        for (int i = 0; i < str.length; i++) {
            String[] words = str[i].trim().split(" ");
            if (words.length>=3 && words.length<=5){
                System.out.println(str[i]);
            }
        }
    }

    public static boolean palindrome(String[] str) {
        boolean isPalindrome = false;
        for (int i = 0; i < str.length; i++) {
            String[] words = str[i].split(" ");
            for (int j = 0; j < words.length; j++) {
                StringBuilder sb = new StringBuilder(words[j]);
                sb.reverse();
                String data = sb.toString();
                if (words[j].equals(data)) {
                    isPalindrome = true;
                }
            }
        }
        System.out.println(str[3]);
        System.out.println(isPalindrome);
        return isPalindrome;
    }
}







