package Day12;

import com.sun.org.apache.xpath.internal.objects.XString;

public class ClassWork12 {
    public static void main(String[] args) {
        System.out.println(teenSum(3, 4)); //→ 7
        System.out.println(teenSum(10, 13));// → 19
        System.out.println(teenSum(13, 2)); //→ 19

        System.out.println(inOrder(1, 2, 4, false));
        System.out.println(inOrder(1, 2, 1, false));
        System.out.println(inOrder(1, 1, 2, true));

        System.out.println(theEnd("Hello", true));// → "H"
        System.out.println(theEnd("Hello", false));// → "o"
        System.out.println(theEnd("oh", true));// → "o"

        System.out.println("String 6");
        System.out.println(endsLy("oddly"));// → true
        System.out.println(endsLy("y"));// → false
        System.out.println(endsLy("oddy"));// → false

        System.out.println("String 8");
        System.out.println(lastChars("last", "chars"));// → "ls"
        System.out.println(lastChars("yo", "java"));// → "ya"
        System.out.println(lastChars("hi", ""));// → "h@"

        System.out.println("String 9");
        System.out.println(seeColor("redxx"));// → "red"
        System.out.println(seeColor("xxred")); //→ ""
        System.out.println(seeColor("blueTimes"));// → "blue"

        System.out.println("String 10");
        System.out.println(extraFront("Hello")); //→ "HeHeHe"
        System.out.println(extraFront("ab")); //→ "ababab"
        System.out.println(extraFront("H")); //→ "HHH"

        System.out.println("String 11");
        System.out.println(startWord("dippo", "hi"));// → "hi"
        System.out.println(startWord("hippo", "xip"));// → "hip"
        System.out.println(startWord("hippo", "i"));// → "h"

        System.out.println("String 13");
        System.out.println(extraEnd("Hello"));// → "lololo"
        System.out.println(extraEnd("ab"));// → "ababab"
        System.out.println(extraEnd("Hi"));// → "HiHiHi"

        System.out.println("String 14");
        System.out.println(withoutEnd("Hello"));// → "ell"
        System.out.println(withoutEnd("java"));// → "av"
        System.out.println(withoutEnd("coding"));//→ "odin"

        System.out.println("String 15");
        System.out.println(left2("Hello"));// → "lloHe"
        System.out.println(left2("java"));// → "vaja"
        System.out.println(left2("Hi"));// → "Hi"

        System.out.println("File 10 2");
        System.out.println(diff21(19));// → 2
        System.out.println(diff21(10));// → 11
        System.out.println(diff21(21));// → 0
        System.out.println(diff21(25));// → 8

        System.out.println("File 10 3");
        System.out.println(nearHundred(93));// → true
        System.out.println(nearHundred(90));// → true
        System.out.println(nearHundred(89));// → false


    }

//3. Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
private static boolean nearHundred(int a) {
        return false;
}
    //2. Given an int n, return the absolute difference between n and 21,
// except return double the absolute difference if n is over 21
    private static int  diff21(int a) {
    int sum=21-a;
        if (a>21){
        return Math.abs(sum)*2;
    } else return Math.abs(sum);

    }

    //15. Given a string, return a "rotated left 2" version where the first 2 chars are
    // moved to the end. The string length will be at least 2.
    private static String left2(String str) {
     return str.substring(2)+str.substring(0,2);
    }


//14. Given a string, return a version without the first and last char, so "Hello" yields "ell".
// The string length will be at least 2.
    private static String withoutEnd(String str) {
        return str.substring(1,str.length()-1);
    }


    //13.Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
// The string length will be at least 2.
private static String extraEnd(String str) {
String temp=str.substring(str.length()-2);
return temp+temp+temp;
}

    //11. Given a string and a second "word" string, we'll say that the word matches the string
// if it appears at the front of the string,
//except its first char does not need to match exactly. On a match, return the front of the string,
// or otherwise return the empty
//string. So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip".
// The word will be at least length 1.
    //возрашаем значение из стоки srt
private static String startWord(String str, String word) {
        if (str.substring(1).startsWith(word.substring(1))) {
            return str.substring(0,1)+word.substring(1);
        }else  return str.substring(0,1);
}
//10. Given a string, return a new string made of 3 copies of the first 2 chars of the original string. The string may be any length. If
//there are fewer than 2 chars, use whatever is there.

private static String extraFront(String str) {
        if (str.length()<2) {
            return str+str+str;
        }else {
            return str.substring(0,2)+str.substring(0,2)+str.substring(0,2);
        }

}
//9. Given a string, if the string begins with "red" or "blue" return that color string,
// otherwise return the empty string
private static String seeColor(String str) {
        if (str.startsWith("red")){
            return "red";
        }
        else if(str.substring(0,4).equals("blue")){
         return "blue";
        }
        else return "";

}

    //Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If
    //either string is length 0, use '@' for its missing char.
    private static String lastChars(String lastStr, String endStr) {
        if (lastStr.length()==0) {
            lastStr="@";
        }
        if (endStr.length()==0)
        {
            endStr="@";
        }
        return lastStr.charAt(0)+endStr.substring(endStr.length()-1);
    }
    //Given a string, return true if it ends in "ly"
    private static boolean endsLy(String str) {
        return str.endsWith("ly");
    }


    // Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back.
    //The string will be non-empty.
    private static String theEnd(String str, boolean b) {
        if (b) {
            return str.substring(0, 1);
        } else {
            return str.substring(str.length() - 1);
        }
    }


    //17 Given three ints, a b c, return true if b is greater than a, and c is greater than b.
    // However, with the exception that if "bOk" is
//true, b does not need to be greater than a.
    private static boolean inOrder(int a, int b, int c, boolean bOK) {
        if (b > a && c > b) {
            return true;

        } else if (bOK && b <= a) {
            return true;
        }
        return false;
    }
    //

    // Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky. So if either value
//is a teen, just return 19.
    private static int teenSum(int a, int b) {
        if (a >= 13 && a <= 19 || b >= 13 && b > 19) {
            return 19;
        } else return (a + b);
    }


}
