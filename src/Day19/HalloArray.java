package Day19;

public class HalloArray {
    public static void main(String[] args) {
        helloMyFirstArray();
        arrayInitialisation();
        germanCities();
        intArrayGame();
    }

    private static void intArrayGame() {
        int[] field=new int[]{5,15,3,67,90};
        System.out.println(field[3]);
        System.out.println(field[4]);
    }

    private static void germanCities() {
        String[] germanCity=new String[]{"Berlin","Muenchen","Dresden","Leipzig","Frankfurt"};
        int size=germanCity.length;
        System.out.println("Kol-vo elementov v massive "+size);

        int countLetter=0;
        for (int i = 0; i < size; i++) {
            countLetter=countLetter+germanCity[i].length();
            System.out.println("Kol-vo vsex bukov v massive "+countLetter);
        }

    }

    private static void arrayInitialisation() {
        int[] field;
        field= new int[10];
        //передаем заполненный массив через {}
        String[] fourSeasons=new String[]{"Vivaldi","Tchaikovski","Astor piazzolla","Stephen Edwin King"};

    }

    private static void helloMyFirstArray() {
        int [] myFirstArray;

        //dataType[] arrayName
        String [] myFirstArrayString;
        double[] gpsPoints;
        boolean[] permissions;

    }
}
