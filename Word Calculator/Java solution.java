//use this code for java swing 

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a list of words separated by spaces: ");
        String input = scanner.nextLine();
        String[] words = input.split("\\s+");

        for (String word : words) {
            int value = calculateWordValue(word);
            System.out.println(word + " = " + value);
        }

        scanner.close();
    }

    public static int calculateWordValue(String word) {
        // Define a mapping of letters to their corresponding positions in the alphabet
        Map<Character, Integer> letterValues = new HashMap<>();
        char currentChar = 'A';
        for (int i = 1; i <= 26; i++) {
            letterValues.put(currentChar, i);
            currentChar++;
        }

        // Convert the word to uppercase for simplicity
        word = word.toUpperCase();

        int totalValue = 0;

        // Iterate through each character in the word and calculate its value
        for (int i = 0; i < word.length(); i++) {
            char currentLetter = word.charAt(i);

            // Check if the character is a letter
            if (Character.isLetter(currentLetter)) {
                // Get the corresponding value from the map and add it to the total
                totalValue += letterValues.get(currentLetter);
            }
        }

        return totalValue;
    }
}
