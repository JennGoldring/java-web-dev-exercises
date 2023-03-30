package exercises;
import java.util.Arrays;
public class Foxy {
    public static void main(String[] args) {
        String fox = "I would not, could not, in a box. I would not, could not with a " +
                "fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = fox.split("\\.");
        System.out.println(Arrays.toString(words));
    }
}
