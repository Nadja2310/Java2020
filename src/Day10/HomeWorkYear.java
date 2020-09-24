package Day10;

public class HomeWorkYear {
    public static void main(String[] args) {
leapYear(1999,2101);
    }
    // Прочитайте в Википедии, какие года являются високосными и дополните предыдущую задачу.
    private static void leapYear(int a, int b) {
//return (year%400==0 ||year%4==0 ^ year%100==0); короткое решение для одного года

        for (int i = a; i <= b; i++) {
            int label = 0;
            if (i % 4 == 0) {
                label=1;
                //System.out.println("popal" + i);

                if (i % 400 != 0 && i % 100 == 0) label=0;
                //Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
                // Годы 1600 и 2000 — високосные, так как они кратны 400.
                // Годы 2100, 2200 и 2300 — невисокосные.
            }
            if (label==1)   System.out.println("leap year " + i + "  ");
        }
    }

}
