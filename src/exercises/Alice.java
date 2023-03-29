package exercises;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Alice {
    public static void main(String[] args) {


        String aliceSentence = "Alice was beginning to get ver tired of sitting by her sister on the bank, " +
            "and of having nothing to do: once or twice she had peeped into the book her sister" +
            "was reading, but it had no pictures or conversations in it, 'and what is th use of a book,'" +
            "though Alice 'without pictures or conversation?";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a search term: ");
        String searchTerm = input.nextLine().toLowerCase();

        int index = aliceSentence.toLowerCase().indexOf(searchTerm);
        int length = searchTerm.length();
        System.out.println("Index of " + searchTerm + " in the sentence: ");
        System.out.println("Length of " + searchTerm + ": " + length);
        //boolean found = aliceSentence.toLowerCase().contains(searchTerm.toLowerCase());
       // System.out.println("Search term found: " + found);
        if (index != -1) {
            aliceSentence = aliceSentence.substring(0,index) + aliceSentence.substring(index + length);
            System.out.println(aliceSentence);
        }
    }
}
