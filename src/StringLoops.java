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
        String word = searchString.toLowerCase();
        String chara = character.toLowerCase();
        int count = 0;
        for (int i = 0; i < searchString.length(); i ++){
            String current = word.substring(i, i+1);
            if(current.equals(chara)){
                count++;
            }
        }
        return count;
    }

    /* Returns the original string reversed

     Examples:
     - if origString = "hello!" this method returns "!olleh"
     - if origString = "Apples and bananas" this method returns "sananab dna selppA"
    */
    public String reverseString(String origString) {
        /* to be implemented */
        int last = origString.length()-1;
        String end = "";
        for (int i = last; i !=-1; i--){
            String letter = origString.substring(i, i+1);
            end += letter;
        }
        return end;
    }
}
