package Day11;

public class ClassWork11 {

    public static void main(String[] args) {
        System.out.println(nearTen(12));
        System.out.println(nearTen(17));
        System.out.println(nearTen(19));

        System.out.println(teaParty(6, 8));
        System.out.println(teaParty(3, 8));
        System.out.println(teaParty(20, 6));

        System.out.println("Ubung 7");
        System.out.println(twoAsOne(1, 2, 3));
        System.out.println(twoAsOne(3, 1, 2));
        //→ true
        System.out.println(twoAsOne(3, 2, 2));
        //→ false
        System.out.println("Ubung 8");
        System.out.println(lastDigit(23, 19, 13));// → true
        System.out.println(lastDigit(23, 19, 12));// → false
        System.out.println(lastDigit(23, 19, 3));// → true
        System.out.println("Ubung 9");
        System.out.println(maxMod5(2, 3)); //→ 3
        System.out.println(maxMod5(6, 2)); //→ 6
        System.out.println(maxMod5(10, 15));//→ 3
        System.out.println("Ubung 10");
        System.out.println(blueTicket(9, 1, 0)); //→ 10
        System.out.println(blueTicket(9, 2, 0)); //→ 0
        System.out.println(blueTicket(6, 1, 4));// → 10
        System.out.println("Ubung 11");
        System.out.println(dateFashion(5, 10)); //→ 2
        System.out.println(dateFashion(5, 2)); //→ 0
        System.out.println(dateFashion(5, 5)); //→ 1


    }


    //11. You and your date are trying to get a table at a restaurant. The parameter "you" is
// the stylishness of your clothes, in the
//range 0..10, and "date" is the stylishness of your date's clothes. The result getting the table is encoded as an int value with
//0=no, 1=maybe, 2=yes. If either of you is very stylish, 8 or more, then the result is 2 (yes). With the exception that if either of
//you has style of 2 or less, then the result is 0 (no). Otherwise the result is 1 (maybe).
    private static int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) return 0;
        else if (you >= 8 || date >= 8) return 2;
        else return 1;

}

    //10. You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs, which we'll call ab, bc, and ac. Consider the
//sum of the numbers in each pair. If any pair sums to exactly 10, the result is 10. Otherwise if the ab sum is exactly 10 more
//than either bc or ac sums, the result is 5. Otherwise the result is 0.
    private static int blueTicket(int a, int b, int c) {
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;
        if (ab == 10 || bc == 10 || ac == 10) return 10;
        if (ab - bc == 10 || ab - ac == 10) return 5;
        else return 0;
    }

    //9. Given two int values, return whichever value is larger.
    // However if the two values have the same remainder when divided by
    //5, then the return the smaller value. However, in all cases, if the two values are the same,

    private static int maxMod5(int a, int b) {
        if (a == b) return 0;
        if (a % 5 == b % 5) return Math.min(a, b);
        else return Math.max(a, b);

    }

    // 8.Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are non-negative. Note:
//the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.
    private static boolean lastDigit(int a, int b, int c) {
        return a % 10 == b % 10 || b % 10 == c % 10 || a % 10 == c % 10;
    }


    //7. Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
    private static boolean twoAsOne(int a, int b, int c) {

        return (a + b == c || b + c == a || a + c == b);
    }


    //We are having a party with amounts of tea and candy. Return the int outcome of the party encoded as 0=bad, 1=good, or
//2=great. A party is good (1) if both tea and candy are at least 5. However, if either tea or candy is at least double the
//amount of the other one, the party is great (2). However, in all cases, if either tea or candy is less than 5, the party is always
//bad (0).
    private static int teaParty(int tee, int candy) {
        if (tee < 5 || candy < 5) return 0;
        if (tee / candy >= 2 || candy / tee >= 2) return 2;
        else return 1;
    }


    //Given a non-negative number "num", return true if num is within 2 of a multiple of 10.
// Note: (a % b) is the remainder of
//dividing a by b, so (7 % 5) is 2. See also: Introduction to Mod
//nearTen(12) → true
//nearTen(17) → false
//nearTen(19) → true
    private static boolean nearTen(int num) {
        return (num % 10 <= 2 || num % 10 >= 8); //остаток от деления должен быть 2 или меньше на 2
    }
}
