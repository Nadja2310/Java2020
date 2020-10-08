package Day23;

public class HomeWorkString23 {
    public static void main(String[] args) {
        System.out.println(repeatSeparator("Word", "X", 3));// → "WordXWordXWord"
        System.out.println(repeatSeparator("This", "And", 2));// → "ThisAndThis"
        System.out.println(repeatSeparator("This", "And", 1)); //→ "This"

        System.out.println("sandwich  " + getSandwich("breadjambread"));// → "jam"
        System.out.println("sandwich  " + getSandwich("xxbreadjambreadyy"));// → "jam"
        System.out.println("sandwich  " + getSandwich("xxbreadyy"));// → ""

        System.out.println(zipZap("zipXzap"));// → "zpXzp"
        System.out.println(zipZap("zopzop"));// → "zpzp"
        System.out.println(zipZap("zzzopzop"));// → "zzzpzp"
        System.out.println(zipZap("zz"));// → "zzzpzpzzz"
    }

    //        Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. Return a string where for
    //        all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
    //
    private static String zipZap(String str) {
        String output = "";

        for (int j = 0; j < str.length(); j++) {
            output = output + str.charAt(j);
            int index = str.indexOf("z", j);
            if (index == j && index != str.length() - 1 && (index+2<=str.length()-1)) {
                if (str.charAt(index) == 'z' && str.charAt(index + 2) == 'p') {
                   j++;
                 }
              }
        }
        return output;
    }

    //       A sandwich is two pieces of bread with something in between. Return the string that is between the first and last
//        appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.

    private static String getSandwich(String str) {
        String outputStr = "";
        String searchStr = "bread";
        if (str.indexOf(searchStr) != -1) {
            String tempStr = str.substring(str.indexOf(searchStr) + searchStr.length());
            int index1 = str.indexOf(searchStr) + searchStr.length();

            if (tempStr.indexOf(searchStr) != -1) {
                int index2 = index1 + tempStr.indexOf(searchStr);
                outputStr = str.substring(index1, index2);
            }
        }
        return outputStr;

    }

    private static String repeatSeparator(String str1, String str2, int repeat) {
        String outputStr = "";
        for (int i = 0; i < repeat - 1; i++) {
            outputStr = outputStr + str1 + str2;
        }
        outputStr = outputStr + str1;
        return outputStr;
    }
}
