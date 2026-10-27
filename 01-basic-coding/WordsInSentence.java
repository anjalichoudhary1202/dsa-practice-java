
public class WordsInSentence {

    public static int calculateTotalWords(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ' &&
                (i == 0 || str.charAt(i - 1) == ' ')) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumped over the lazy dog.";
        System.out.println(calculateTotalWords(sentence));
    }
}
