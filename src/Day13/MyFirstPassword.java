package Day13;

public class MyFirstPassword {
    public static void main(String[] args) {
        String myLittelPassword="dkhfakdjgfjgasfkjgaskdgqsiöu";
        generatePassword(20);
        generatePassword(5);

    }

    private static void generatePassword(int userInput) {
    String resul="";
        for (int i = 0; i < userInput; i++) {
            int min = 65;
            int max = 90;//kod simvolov v English alfabet
            char c= (char) ((Math.random() * (max - min) + 1) + min);
            resul+=c;

        }
        System.out.println(resul);
    }
}
