package methods;

import java.util.Arrays;

public class CountOccurences {
    public static void main(String[] args) {
char[] letters = {'A', 'I', 'C','D','D','D'};
int count = countOccurences(letters, 'D');
        System.out.println(count);
    }
    public static int countOccurences(char [] letters, char searchLetter){
        System.out.println(Arrays.toString(letters));
        System.out.println(searchLetter);
    int count = 0;
    for (char letter : letters){
        if (letter == searchLetter){
            count++;

        }
    }


        return count;
    }
}