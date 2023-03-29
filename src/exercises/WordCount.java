package exercises;
import java.util.Scanner;
    public class WordCount {
        public static void main(String[] args) {
            String aliceSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a word to count: ");
            String word = scanner.nextLine().toLowerCase();

            String[] words = aliceSentence.toLowerCase().split("\\W+"); // split sentence into words
            int count = 0;
            for (String w : words) {
                if (w.equals(word)) {
                    count++;
                }
            }

            System.out.println("The word \"" + word + "\" appears " + count + " times in the sentence.");
        }
    }

