package com.mihajlo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	    String string = "I am a String. Yes, I am";
        System.out.println(string);
        String yourString = string.replaceAll("I" , "You");
        System.out.println(yourString);

        String alphanumeric = "abcDeeeF12Ghiiiijkl99z";
        // . -> replaces all the characters
        System.out.println(alphanumeric.replaceAll("." , "Y"));

        //replaces only the beginning of the String
        System.out.println(alphanumeric.replaceAll("^abcDeee", "YYY"));

        String secondString = "abcDeeeF12GhabcDeeeiiiijkl99z";
        System.out.println(secondString.replaceAll("^abcDeee", "YYY"));

        //Checks if the whole string is a match
        System.out.println(alphanumeric.matches("^hello"));
        System.out.println(alphanumeric.matches("^abcDeee"));
        System.out.println(alphanumeric.matches("abcDeeeF12Ghiiiijkl99z"));

        // $ -> replaces the end of the String
        System.out.println(alphanumeric.replaceAll("jkl99z$" , "THE END"));

        // [] -> replaces each individual letter
        System.out.println(alphanumeric.replaceAll("[aei]" , "X"));
        System.out.println(alphanumeric.replaceAll("[aei]" , "I replaced the letter HERE"));

        // replacement happens if only [] is followed by the other [] characters
        System.out.println(alphanumeric.replaceAll("[aei][Fj]","X"));

        System.out.println("harry".replaceAll("[Hh]arry" , "Harry"));

        String newAlphanumeric = "abcDeeeF12Ghiiijkl99z";
        // [^ charactes] replaces all other characters except the ones that are in the square brackets
        System.out.println(newAlphanumeric.replaceAll("[^ej]" , "X"));

        // [] is case sensitive
        System.out.println(newAlphanumeric.replaceAll("[abcdef345678]" , "X"));
        System.out.println(newAlphanumeric.replaceAll("[a-f3-8]" , "X"));
        // (?i)[] removes case sensitivity
        System.out.println(newAlphanumeric.replaceAll("(?i)[a-f3-8]", "X"));
        // \\d replaces all numbers from 0 to 9
        System.out.println(newAlphanumeric.replaceAll("[0-9]" , "X"));
        System.out.println(newAlphanumeric.replaceAll("\\d" , "X"));
        // \\D replaces all non-digits
        System.out.println(newAlphanumeric.replaceAll("\\D" , "X"));

        String hasWhiteSpace = "I have blanks and \ta tab, and also a newline\n";
        System.out.println(hasWhiteSpace);
        // \\s removing all spaces tabs and new lines
        System.out.println(hasWhiteSpace.replaceAll("\\s" , ""));
        // \t replacing tab
        System.out.println(hasWhiteSpace.replaceAll("\t" , "X"));
        // removing all the non-white spaces
        System.out.println(hasWhiteSpace.replaceAll("\\S" , ""));
        // replaces all the characters from a-z 0-9 and the underscore
        System.out.println(newAlphanumeric.replaceAll("\\w" , "X"));
        System.out.println(hasWhiteSpace.replaceAll("\\w" , "X"));

        String thirdAlphanumericString = "abcDeeeF12Ghiiiijkl99z";
        // {3} how many characters are of the same
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe{3}", "YYY"));
        // + no matter how many are in a row replace them
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe+","YYY"));
        // * whether is got the letter after it or not replace it
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe*" , "YYY"));
        // {2,5} from 2 to 5 characters
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe{2,5}" , "YYY"));

        System.out.println(thirdAlphanumericString.replaceAll("h+i*j", "Y"));

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p> This is a paragraph about something</p>");
        htmlText.append("<p>This is another paragraph</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary</p>");
        //
        String h2Pattern = "(<h2>)";
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());

        matcher.reset();
        int count = 0;
        while (matcher.find()){
            count++;
            System.out.println("Occurrence " + count + " : " + matcher.start() + " to " + matcher.end());

        }


        String h2GroupPattern = "(<h2>.*?</h2>)";
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();

        while (groupMatcher.find()){
            System.out.println("Occurence: "+ groupMatcher.group(1));
        }

        String h2TextGroups = "(<h2>)(.+?)(</h2>)";
        Pattern h2TextPattern = Pattern.compile(h2TextGroups);
        Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);

        while (h2TextMatcher.find()){
            System.out.println("Occurrence " + h2TextMatcher.group(2));
        }

        //"abc" "a" and "b" and "c"
        //[Hh]arry
        System.out.println("harry".replaceAll("[H|h]arry", "Larry"));
        System.out.println("Harry".replaceAll("[H|h]arry", "Larry"));

        // [^abc]
        String tvTest = "tstvtkt";
        String tNotVRegexp = "t(?!v)";
        Pattern tNotVPattern = Pattern.compile(tNotVRegexp);
        Matcher tNotVMatcher = tNotVPattern.matcher(tvTest);

        count = 0;
        while (tNotVMatcher.find()){
            count++;
            System.out.println("Occurrence " + count + " : " + tNotVMatcher.start() + " to " + tNotVMatcher.end());
        }
        // t(?=v) positive look ahead
        // ^([\(]{1}[0-9]{3}[\)]{1}[ ]{1}[0-9]{3}[\-]{1}[0-9]{4})$ -> phone number check
        String phone1 = "1234567890"; // shouldn't match
        String phone2 = "(123) 456-7890";//match
        String phone3 = "123 456-7890";//shouldn't match
        String phone4 = "(123)456-7890";//shouldn't match
        System.out.println("phone1 = " + phone1.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone2 = " + phone2.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone3 = " + phone3.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone4 = " + phone4.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));

        System.out.println("-----------------------------------");

        // ^4[0-9]{12}([0-9]{3})?$ -> visa card check
        String visa1 = "4444444444444"; // match
        String visa2 = "5444444444444"; // no match
        String visa3 = "4444444444444444"; // match
        String visa4 = "4444";// no match

        System.out.println("visa1 = " + visa1.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa2 = " + visa2.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa3 = " + visa3.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa4 = " + visa4.matches("^4[0-9]{12}([0-9]{3})?$"));
    }
}
