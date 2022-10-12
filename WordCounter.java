import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * This is a Word-Counter Program.
 * @author 220031985
 *
 */
public class WordCounter {

    private static void printLine2(int maxWordLength, int maxCountLength) {
        System.out.print("| ");
        System.out.print("WORD");
        for (int i = 0; i <= (maxWordLength - "WORD".length()) - 1; i++) {
            System.out.print(" ");
        }
        System.out.print(" | ");
        System.out.print("COUNT");
        for (int i = 0; i <= (maxCountLength - "COUNT".length()) - 1; i++) {
            System.out.print(" ");
        }
        System.out.print(" |");
        System.out.println();
    }
    private static void printLine1(int maxWordLength, int maxCountLength) {
        System.out.print("|");
        for (int i = 0; i <= maxWordLength + 1; i++) {
            System.out.print("-");
        }
        System.out.print("|");
        for (int i = 0; i <= maxCountLength + 1; i++) {
            System.out.print("-");
        }
        System.out.print("|");
        System.out.println();
    }
    private static void printRow(String word, int count, int maxSpace, int countSpace) {
        System.out.print("| ");
        System.out.print(word);
        for (int i = 0; i <= maxSpace - word.length(); i++) {
            System.out.print(" ");
        }
        System.out.print("| ");
        for (int i = 0; i < countSpace - String.valueOf(count).length(); i++) {
            System.out.print(" ");
        }
        System.out.print(count);
        System.out.print(" |");
        System.out.println();
    }
    private static void printTotal(int maxWordLength, int maxCountLength, int total) {
        System.out.print("| ");
        System.out.print("TOTAL");
        for (int i = 0; i <= (maxWordLength - "TOTAL".length()) - 1; i++) {
            System.out.print(" ");
        }
        System.out.print(" | ");
        for (int i = 0; i < maxCountLength - String.valueOf(total).length(); i++) {
            System.out.print(" ");
        }
        System.out.print(total);
        System.out.print(" |");
        System.out.println();
    }
    /**
     * This is the main method.
     * @param args passing strings as arguments
     * @returns : void
     * @throws IOException FILE DIDN'T FIND
     */
    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            System.out.println("Usage: java WordCounter <filename> <searchTerm>");
        } else if (args.length > 2) {
            try {
                /**
                 * The code below has taken from a website at
                 * https://www.candidjava.com/tutorial/java-program-to-count-number-of-words-in-a-file>/FIND AND COUNT THE WORD
                 */
                /* BEGIN Copied Code */
                File newFile = new File(args[0]); //Creation of File Descriptor for input file
                String[] words; //Initialize the word Array
                FileReader reader = new FileReader(newFile); //Creation of a File Reader object
                BufferedReader bufferReader = new BufferedReader(reader); //Creation of BufferedReader object
                /* END Copied Code */
                String s;
                String[] input = new String[args.length - 1];
                int[] count = new int[args.length - 1];
                System.arraycopy(args, 1, input, 0, args.length - 1); // Input word to be searched
                while ((s = bufferReader.readLine()) != null) { //Reading Content from the file
                    words = s.split("[^A-Za-z0-9_]"); //Split the word using space
                    for (String word: words) {
                        for (int i = 0; i < input.length; i++) {
                            if (word.equals(input[i])) { //Search for the given word
                                count[i] = count[i] + 1; //If the Present increase the count by one
                            }
                        }
                    }
                }
                int total = 0;
                int maxLength = "WORD".length();
                int maxCountLength = "COUNT".length();
                for (int i = 1; i < args.length; i++) {
                    if (args[i].length() > maxLength) {
                        maxLength = args[i].length();
                    }
                }
                for (int i = 0; i < count.length; i++) {
                    if (String.valueOf(count[i]).length() > maxCountLength) {

                        maxCountLength = String.valueOf(count[i]).length();
                    }
                }
                reader.close();
                printLine1(maxLength, maxCountLength);
                printLine2(maxLength, maxCountLength);
                printLine1(maxLength, maxCountLength);
                String word;
                int numCount;
                for (int i = 0; i < input.length; i++) {
                    word = input[i];
                    numCount = count[i];
                    printRow(word, numCount, maxLength, maxCountLength);
                }
                for (int j = 0; j < input.length; j++) {
                    total += count[j];
                }
                printLine1(maxLength, maxCountLength);
                printTotal(maxLength, maxCountLength, total);
                printLine1(maxLength, maxCountLength);
            } catch (FileNotFoundException e) {
                System.out.println("File not found: " + args[0]);
            }
        } else if (args.length == 2) {
            try {
                /**
                 * The code below has taken from a website at
                 * https://www.candidjava.com/tutorial/java-program-to-count-number-of-words-in-a-file>/FIND AND COUNT THE WORD
                 */
                /* BEGIN Copied Code */
                File newFile = new File(args[0]); //Creation of File Descriptor for input file
                String[] words; //Initialize the word Array
                FileReader reader = new FileReader(newFile); //Creation of a File Reader object
                BufferedReader bufferReader = new BufferedReader(reader); //Creation of BufferedReader object
                String s;
                /* END Copied Code */
                String[] input = new String[args.length - 1];
                System.arraycopy(args, 1, input, 0, args.length - 1); // Input word to be searched
                int count = 0; //Initialize the word to zero
                while ((s = bufferReader.readLine()) != null) { //Reading Content from the file

                    words = s.split("[^A-Za-z0-9_]"); //Split the word using GIVEN : [^A-Za-z0-9_] Constraints
                    for (String word: words) {
                        if (word.equals(input[0])) { //Search for the given word

                            count++; //If the words have matched, increment the value of the count.
                        }
                    }
                }
                if (count != 0) { // If Count is not empty, Begin Multi-Word Condition.
                    if (count == 1) {
                        System.out.println("The word '" + args[1] + "' appears " + count + " time.");
                    } else {
                        System.out.println("The word '" + args[1] + "' appears " + count + " times.");
                    }

                } else {
                    System.out.println("The word '" + args[1] + "' appears " + count + " times.");
                }

                reader.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found: " + args[0]); // throw new RuntimeException(e) and print "File not Found".
            }
        }
    }
}
