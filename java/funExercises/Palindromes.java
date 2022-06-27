import java.util.ArrayList;
import java.util.List;

public class Palindromes {
    
    public static void main(String[] args) {

        System.out.println("----------------ARRAY OF PALINDROMES AND NON-PALINDROMES----------------");
        //create array list with given words as strings
        //find all words that are palindromes
        //put them in new list and sysout
        //find all words that are NOT palindromes
        //put them in new list and sysout

        List<String> originalList = List.of("karan", "madam", "tom", "civic", "radar", "sexes", "jimmy", "kayak", "john", "refer", "billy", "billy", "did");
        System.out.println(originalList);
        // ArrayList<String> palindromeList = new ArrayList<String>();
        // ArrayList<String> NonPalindromeList = new ArrayList<String>();

        // for(int i = originalList.length() -1; i >= 0; i--){
        //     reverse += originalList
        // }
        findingPalindromes(originalList);
    }

    private static List<String> findingPalindromes(List<String> originalList) {
        // String reverse = "";
        originalList.forEach(word -> {
            for(int i = word.length() - 1; i >= 0; i--) {
                String reverse = "";
                reverse += word.charAt(i);
                System.out.println(reverse);
            }
    
            boolean palindrome = true;
            for(int i = 0; i < word.length(); i++) {
                String reverse = "";
                if(word.charAt(i) != reverse.charAt(i)) {
                    palindrome = false;
                }
            }
    
            if(palindrome) {
                List<String> palindromeList = new List<String>();
                palindromeList.addAll(palindrome);
                return palindromeList;
                
            } else {
                List<String> nonPalindromeList = new List<String>();
                nonPalindromeList.addAll(!palindrome);
                return nonPalindromeList;
            }

            //TODO: attempt make string void and sysout lists

        });
    }
}

/*
 * Each exercise should be done on its own folder/class
 * Feel free to add as many classes as you want per exercise
 * All code/work should be done in at least 1 additional private method, called from the main function
 * Sysout the description of each exercise
*/