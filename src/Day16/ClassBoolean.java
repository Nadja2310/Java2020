package Day16;

import org.omg.CORBA.MARSHAL;

public class ClassBoolean {
    public static void main(String[] args) {
        // Given three ints, a b c, return true if one of them is 10 or more less than one of the others.
/*        System.out.println(lessBy10(1, 7, 11));// → true
        System.out.println(lessBy10(1, 7, 10));// → false
        System.out.println(lessBy10(11, 1, 7));// → true
        //19
        System.out.println(redTicket(2, 2, 2));// → 10
        System.out.println(redTicket(2, 2, 1));// → 0
        System.out.println(redTicket(0, 0, 0));// → 5
        System.out.println(redTicket(0, 1, 2));// → 1
        //20  Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and
        // (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)
        System.out.println(shareDigit(12, 23));// → true
        System.out.println(shareDigit(12, 43));// → false
        System.out.println(shareDigit(12, 44));// → false
        //21
        System.out.println(squirrelPlay(70, false));// → true
        System.out.println(squirrelPlay(95, false));// → false
        System.out.println(squirrelPlay(95, true));// → true*/
        //22
        System.out.println(alarmClock(1, false));// → "7:00"
        System.out.println(alarmClock(5, false));// → "7:00"
        System.out.println(alarmClock(0, false));// → "10:00"
       System.out.println(alarmClock(0, true));// → "off"
        answerCell(false, false, false);// → true
        answerCell(false, false, true);// → false
        answerCell(true, false, false);// → false


    }

    private static boolean answerCell(boolean morning, boolean mama, boolean asleep) {
        if (asleep){
            return false;
        } else if (morning&& !mama) {
            return false;
        }
        return true;
    }

    //2. Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation, return a
//string of the form "7:00" indicating when the alarm clock should ring. Weekdays,
// the alarm should be "7:00" and on the
//weekend it should be "10:00". Unless we are on vacation -- then on weekdays
// it should be "10:00" and weekends it should
//be "off".
    private static String alarmClock(int weekdays, boolean vacation) {
        if (weekdays<6 && !vacation) {
            return "7:00";

        }//else if (weekdays>6 && !vacation) return "10:00";
        else if (weekdays>6 && vacation)  return "off";
        else return "10:00";
    }

    private static boolean squirrelPlay(int temper, boolean summer) {
        int min=60;
        int max =90;
        if (summer) {
            max+=10;
        }
        return  (temper>=min && temper<=max );
    }

    private static boolean shareDigit(int a, int b) {
        int a1 = a / 10;
        int a2 = a % 10;
        int b1 = b / 10;
        int b2 = b % 10;
        return ((a1 == b1 || a1 == b2) || (a2 == b1 || a2 == b2));
    }

    private static int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        } else if (a == b && b == c) {
            return 5;
        } else if (b != a && c != a) {
            return 1;
        } else return 0;
    }

    private static boolean lessBy10(int a, int b, int c) {

        return (Math.abs(a - b) >= 10 || Math.abs(b - c) >= 10 || Math.abs(a - c) >= 10);
    }
}
