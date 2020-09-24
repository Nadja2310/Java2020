package Day6;

public class ClassWork {
    public static void main(String[] args) {
        String myName = "Bob";
        System.out.println(helloName(myName));
        split();
        String simString;
        String inputString;
        simString = "<<>>";
        inputString = "Yay";
        System.out.println(makeOutWord(simString, inputString));
        System.out.println(makeOutWord("<<>>", "WooHoo"));
        System.out.println(makeOutWord("[[]]", "word"));
        split();
        // ****** 3
        System.out.println(firstHalf("WooHoo"));
        System.out.println(firstHalf("HelloThere"));
        System.out.println(firstHalf("ab2cdef"));
        split();
        //****** 4
        nonStart("Hello", "There");
        nonStart("java", "code");
        nonStart("shotl", "java");
        split();

        System.out.println(middleThree("Candy"));
        System.out.println(middleThree("and"));
        System.out.println(middleThree("solving"));
        split();

        //******8
        lastChars("last", "chars");// → "ls"
        lastChars("yo", "java");// → "ya"
        lastChars("hi", "");// → "h@"
        lastChars("", "last");// → "@t"
        split();
//**********12
        System.out.println(makeAbba("Hi", "Bye"));
        System.out.println(makeAbba("Yo", "Alice"));
        System.out.println(makeAbba("What", "Up"));
    }

    //12. Given two strings, a and b, return the result of putting them together in the order abba,
// e.g. "Hi" and "Bye" returns "HiByeByeHi"

    private static String makeAbba(String inputStringa, String inputStringb) {
        return inputStringa + inputStringb + inputStringb + inputStringa;
    }

    //8. Given 2 strings, a and b, return a new string made of the first char of a and the last char of b,
// so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.

    private static void lastChars(String inputStringa, String inputStringb) {
        char subSym = '\u0040';
//int dlina=(int)inputStringa.length();
        // System.out.println("Задание 8");
        if (inputStringa.length() == 0 && inputStringb.length() > 0) {
            System.out.println(subSym + inputStringb.substring(inputStringb.length() - 1));
        } else if (inputStringb.length() == 0 && inputStringa.length() > 0) {
            System.out.println(inputStringa.charAt(0) + subSym); //он сложил символы
            System.out.println(inputStringa.substring(0, 1) + subSym);
        } else if (inputStringb.length() == 0 && inputStringa.length() == 0) {
            System.out.println(subSym + subSym);
        } else {
            System.out.println(inputStringa.charAt(0) + inputStringb.substring(inputStringb.length() - 1));
        }
    }

    //7. Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and".
    // The string length will be at least 3.
    private static String middleThree(String str) {
        String result = str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
        return result;
    }

    public static void split() {
        System.out.println("__________");
    }

    //4. Given 2 strings, return their concatenation, except omit the first char of each.
    // The strings will be at least length 1

    private static void nonStart(String inputString1, String inputString2) {
        String str1 = inputString1.substring(1) + inputString2.substring(1);
        //return str1;
        System.out.println(str1);
    }

    //3. Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

    private static String firstHalf(String inputString) {
        //int lengthstring=inputString.length()/2;
        return inputString.substring(0, inputString.length() / 2);
    }
// 2.Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out
    //string, e.g. "<>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.

    private static String makeOutWord(String simString, String inputString) {
        return simString.substring(0, 2) + inputString + simString.substring(simString.length() - 2);
    }


    //1. Given 2 strings, return their concatenation, except omit the first char of each.
    // The strings will be at least length 1.

    private static String helloName(String userName) {

        return "Hello " + userName + "!";
    }

}
