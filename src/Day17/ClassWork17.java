package Day17;

public class ClassWork17 {
    public static void main(String[] args) {
        // Given a string, return a string where for every char in the original, there are two chars
       /* System.out.println(doubleChar("The")); //→ "TThhee"
        System.out.println(doubleChar("AAbb")); //→ "AAAAbbbb"
        System.out.println(doubleChar("Hi-There"));
*/
        System.out.println(countCode("aaacodebbb"));// → 1
        System.out.println(countCode("codexxcode"));// → 2
        System.out.println(countCode("cozexxcope"));// → 2

        //3. Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char
        System.out.println(bobThere("abcbob"));// → true
        System.out.println(bobThere("b9b"));// → true
        System.out.println(bobThere("bac"));// → false
// Given a string and an int n, return a string made of n repetitions of the last n characters of the string. You may assume that
//n is between 0 and the length of the string, inclusive.
        System.out.println(repeatEnd("Hello", 3));// → "llollollo"
        System.out.println(repeatEnd("Hello", 2));// → "lolo"
        System.out.println(repeatEnd("Hello", 1));// → "o"
        //       5. Given a string, consider the prefix string made of the first N chars of the string.
        //       Does that prefix string appear somewhere
//else in the string? Assume that the string is not empty and that N is in the range 1..str.length().

        System.out.println(prefixAgain("abXYabc", 1));// → true
        System.out.println(prefixAgain("abXYabc", 2));// → true
        System.out.println(prefixAgain("abXYabc", 3));// → false
    }

    private static boolean prefixAgain(String str, int n) {
        char bukva = str.charAt(n - 1);
        System.out.println("" + "Ищем букву "+bukva);
        for (int i = n; i < str.length(); i++) {
            if (str.charAt(i) == bukva) {
                return true;
            }
        }

        return false;
    }

    private static String repeatEnd(String str, int number) {
        int strLenght = str.length();
        String outStr = "";
        for (int i = 0; i < number; i++) {
            outStr += str.substring(strLenght - number);
        }
        return outStr;
    }

    private static boolean bobThere(String str) {

        for (int i = 0; i < str.length(); i++)
            if ((str.charAt(i) == 'b' && str.charAt(i + 2) == 'b')) {
                return true;
            }
        return false;
    }

    private static int countCode(String str) {
        int index;
        int count = 0;
        index = str.indexOf("co");
        for (int i = index; i < str.length(); i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }


}
