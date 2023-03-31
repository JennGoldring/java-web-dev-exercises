package org.launchcode.java.studio2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
//        String myString = "If the product of two terms is zero then common sense says " +
//                "at least one of the two terms has to be zero to start with. " +
//                "So if you move all the terms over to one side, you can " +
//                "put the quadratics into a form that can be factored allowing " +
//                "that side of the equation to equal zero. Once you’ve done that, " +
//                "it’s pretty straightforward from there.";
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String myString = input.nextLine().toLowerCase();

        myString = myString.replaceAll("[^a-zA-Z0-9]", "");
        char[] charactersInString = myString.toCharArray();

        HashMap<Character, Integer> charMap = new HashMap<>();
        for (char c : charactersInString) {
            Integer count = charMap.get(c);
            if (!charMap.containsKey(c)) {
                charMap.put(c, 1);
            } else {
                charMap.put(c, count + 1);
            }
        }
        for (Character c : charMap.keySet()) {
            System.out.println(c + ": " + charMap.get(c));
        }
    }
}

// first create key value pair in each instance when it hasn't been defined yet.
// if already defined them +1 and if not add new key.