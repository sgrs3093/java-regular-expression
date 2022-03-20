package regualrexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression
{
    public static void main (String[] args)
    {

        //String
        String line = "this is regular expression pattern for QT3000! OK?";
        String pattern = "(.*)(\\d+)(.*)";
        //for matching any whitespace we can use below pattern
        Pattern whitespace = Pattern.compile("\\s", Pattern.UNICODE_CHARACTER_CLASS);

        Pattern p = Pattern.compile(pattern);

        //matcher object
        Matcher m = p.matcher(line);

        if (m.find()) {
            System.out.println("GROUP COUNT :" + m.groupCount());
            System.out.println("Found value group:" + m.group());
            System.out.println("Found value :" + m.group(0));
            System.out.println("Found value :" + m.group(1));
            System.out.println("Found value :" + m.group(2));
            System.out.println("Found value :" + m.group(3));
        }

    }

}
