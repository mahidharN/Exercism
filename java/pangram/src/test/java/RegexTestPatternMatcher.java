import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTestPatternMatcher {
    private static final String EXAMPLE_TEST = "This is my small example string which I'm going to use for pattern matching.";

    private static char[] A2Z = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\w+", Pattern.CASE_INSENSITIVE);
        // in case you would like to ignore case sensitivity,
        // you could use this statement:
        // Pattern pattern = Pattern.compile("\\s+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(EXAMPLE_TEST);
        // check all occurance
        while (matcher.find()) {
            System.out.print("Start index: " + matcher.start());
            System.out.print(" End index: " + matcher.end() + " ");
            System.out.println(matcher.group());
        }
        System.out.print("the lettes are ");
        for (char alphabet : A2Z)
        {
            System.out.print("\n" +alphabet);
        }
    }
}