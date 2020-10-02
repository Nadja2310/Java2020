package Day18;

public class ClassWork18Schule {
    public static void main(String[] args) {
        double flache1 = flacheSphaere(58);
        double flache2 = flacheWuerfel(40);
        double flache3 = flachePyramide(30, 20);
        double flache4 = flacheQuader(80, 30, 20);
        double gesamtFlaeche = flache1 + flache2 + flache3 + flache4;
        double mengeFarbe = findeFarbenMenge(gesamtFlaeche, 560);
        int anzahlDosen = countDosen(mengeFarbe);
        double price = priceCount(anzahlDosen, 17.00);
        System.out.println("Gesamtkosten betrag "+price);

    }

    private static double priceCount(int anzahlDosen, double price) {
        return anzahlDosen*price;
    }

    private static int countDosen(double mengeFarbe) {
        System.out.println("Mögliche Menge der Dosen "+Math.ceil(mengeFarbe/400));
        return (int) Math.ceil(mengeFarbe/400);
    }

    private static double findeFarbenMenge(double f, int ml) {
        f=f/10000; // cm v kvadrate v m kvadr.
        return f*ml;
    }

    private static int flacheQuader(int a, int b, int c) {
        return 2*(a*b+b*c+a*c);
    }

    private static double flachePyramide(int a, int b) {

        return (b * Math.sqrt(a * a - ((b * b) / 4))) / 2;
    }

    private static double flacheSphaere(int d) {
        return (Math.PI * d * d);
    }

    private static double flacheWuerfel(int a) {
        return (6 * (a * a));
    }

}
