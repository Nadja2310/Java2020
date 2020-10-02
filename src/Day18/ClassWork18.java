package Day18;

/*
public class ClassWork18 {
    public static void main(String[] args) {
*/
/*        System.out.println(makeBricks(3, 1, 8));// → true
        System.out.println(makeBricks(3, 1, 9));// → false
        System.out.println(makeBricks(3, 2, 10));// →Object tru;*//*


        System.out.println(prefixAgain("abXYabc", 1));// → true
        System.out.println(prefixAgain("abXYabc", 2));// → true
        System.out.println(prefixAgain("abXYabc", 3));// → false

    }
// Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear somewhere
//else in the string? Assume that the string is not empty and that N is in the range 1..str.length().
    private static boolean prefixAgain(String inputStr, int strLength) {
        String searchStr=inputStr.substring(0,strLength);
        for (int i = strLength; i <inputStr.length() ; i++) {
            if (strLength + i <= inputStr.length()) {
            if (searchStr.equals(inputStr.substring(i,strLength+i))){
                return true;
            }
        }
        return false;
    }

    //1. We want to make a row of bricks that is goal inches long. We have a number of small bricks
// (1 inch each) and big bricks (5 inches each). Return true if it is possible to make the goal
// by choosing from the given bricks. This is a little harder than it
//looks and can be done without any loops. See also: Introduction to MakeBricks
    //private static boolean makeBricks(int countSmallBricks, int countBigBricks, int goal) {
        */
/*int smallBricks = 1;
        int bigBricks = 5;
        int size = countSmallBricks * smallBricks + bigBricks * countBigBricks;
        return (size >= goal);*//*

       //     return false;

   // }

}
*/
