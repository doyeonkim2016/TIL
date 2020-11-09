import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    public static void main(String[] args) {

        String regex = "\\b(\\w+)(\\s+\\1\\b)+";
        Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(),m.group(1));
            }
            
            // Prints the modified sentence.
            System.out.println(input);
        }
        
        in.close();
    }
}


/*
Regex Explanation
Regex "\\b(\\w+)(\\s+\\1\\b)+"
\w -> A word character :[a-zA-Z_0-9]
\W -> A non-word character :[^\W]
\b-> word boundary
\1 -> Matches whatever was matched in the 1st group of parentheses, which in this case is \w+
+ -> Match whatever its placed after 1 or more times.

The \b boundaries are needed for special cases such as "Bob and Andy" We dont want to match "and" twice.

Group
#################################################
input = input.replaceAll(m.group(),m.group(1));
#################################################

This line of codereplaces the entier match with the first group in the match.

m.group() is the entire matchm.group(i) is the ith match. 



