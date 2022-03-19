package regualrexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression3
{
    public static void main (String[] args)
    {

        // Pattern pattern = Pattern.compile("contains\\((.*),\\s*'(.*)'(,.*)?");

        String line = "OR contains (abs,'da')";

        // String pattern1 = "(.*)(\\d+)(.*)";//+ one or more digit
        String pattern2  = "OR contains\\((.*),\\s*'(.*)'(,.*)?";//without space
        String pattern  = "OR contains\\s\\((.*),\\s*'(.*)'(,.*)?";//with space
        String pattern3  = "contains\\((.*),\\s*'(.*)'(,.*)?";// checking contains
        String pattern4  = "contains\\s\\((.*),\\s*'(.*)'(,.*)?";// checking contains without space

        Pattern p = Pattern.compile(pattern,Pattern.CASE_INSENSITIVE);

        //matcher object
        Matcher m = p.matcher(line);

        if (m.find()) {
            System.out.println("GROUP COUNT :" + m.groupCount());
            System.out.println("Found value group:" + m.group());
            System.out.println("Found value 0:" + m.group(0));
            System.out.println("Found value 1:" + m.group(1));
            System.out.println("Found value 2:" + m.group(2));
            System.out.println("Found value 3:" + m.group(3));
        }

    }
}
