package regualrexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression2
{
    //for OR contains : if sql has the contains this pattern will fetch out the details
    // nodeString : contains(ABCLangAssociation.Name,  'User1')
    static Pattern pattern = Pattern.compile("contains\\((.*),\\s*'(.*)'(,.*)?",
                                             Pattern.CASE_INSENSITIVE);
    //for OR contains : if sql has the combination of OR contains this pattern will fetch out the details
    static Pattern pattern1 = Pattern.compile("OR contains\\s\\((.*),\\s*'(.*)'(,.*)?",
                                              Pattern.CASE_INSENSITIVE);

    public static void main (String[] args)
    {

        // Pattern pattern = Pattern.compile("contains\\((.*),\\s*'(.*)'(,.*)?");
        String line = "";

        // String pattern1 = "(.*)(\\d+)(.*)";//+ one or more digit
        String pattern = "contains\\((.*),\\s*'(.*)'(,.*)?";//without space
        String pattern1 = "contains\\s\\((.*),\\s*'(.*)'(,.*)?";//with space

        Pattern p = Pattern.compile(pattern);

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
