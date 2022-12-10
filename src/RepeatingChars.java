import static java.util.Collections.replaceAll;

public class RepeatingChars {
    public static void main(String[] args) {

        String testString = "aaaabbbdddeeffffggggghhhhhiiiij";
        findRepeats(testString);


    }

    public static void findRepeats(String string) {
        int match = 0;
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < string.length(); j++) {
               if(string.charAt(i) == string.charAt(j)) {
                  match++;
               }
            }
            System.out.println(string.charAt(i) + " -- " + match);
            String dupe = String.valueOf(string.charAt(i)).trim();
            string = string.replaceAll(dupe, "");
            match = 0;
        }
    }
}
