import java.util.Locale;

public class StringLoops
{
    // default constructor; no instance variables
    public StringLoops() { }

    /* Returns the number of times "character" appears in "searchString"
       This should be NON-case sensitive!

       Examples:
       - if character = "a" and searchString = "Apple and banana",
         this method returns 5 (it finds BOTH "A" and "a")
       - if character = "A" and searchString = "Apple and banana",
         this method returns 5 (it finds BOTH "A" and "a")
       - if character = "!" and searchString = "Hello! Nice day!",
         this method returns 2

        DO THIS WITH A FOR LOOP!
      */
    public int countCharacters(String character, String searchString) {
        /* to be implemented */
        int counter = 0;
        for (int i = 0; i < searchString.length(); i++) {
            if ((searchString.substring(i)).indexOf(character) != -1 || (searchString.substring(i)).indexOf(character.toLowerCase()) != -1){
                searchString = searchString.substring(searchString.indexOf(character));
                counter ++;
            }
        }
        return counter;
    }

    /* Returns the original string reversed

     Examples:
     - if origString = "hello!" this method returns "!olleh"
     - if origString = "Apples and bananas" this method returns "sananab dna selppA"
    */
    public String reverseString(String origString) {
        /* to be implemented */
        String newString = "";
        for (int i = origString.length(); i >= 0; i--) {
            newString = newString + origString.substring(i, i + 1);
        }
        return newString;
    }
}
