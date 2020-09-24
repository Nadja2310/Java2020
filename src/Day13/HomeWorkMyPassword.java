package Day13;

public class HomeWorkMyPassword {
    public static void main(String[] args) {
        int inputlanguage = 1; //1 - eng 2- rus
        int size = 6;
       // char s = 'Э';
       // int f = (int) s;

        System.out.println("Passwort "+myPassword(size, inputlanguage));
        System.out.println("Passwort "+myPassword(size, 2));
    }

    //Давайте напишем генератор паролей. Методу передаётся длина пароля.
    // И метод генерирует пароль используя
    //латиницу, цифры и некоторые спецсимволы(на ваш выбор).
    private static String myPassword(int sizePassword, int languagePassword) {
        int a = 0;
        int b = 0;
        String resul="";
        if (languagePassword == 1) {
            a = 65;
            b = 90;
        } else if (languagePassword == 2) {
            a = 1040;
            b = 1069;
        }
        for (int i = 0; i < sizePassword; i++) {

            char c = (char) ((Math.random() * (b - a) + 1) + a);

            resul += c;
            int number = (int) (Math.random()*10);
            resul += number;
        }
        //спецсимволы от 33 до 47
        int wildcard1=33;
        int wildcard2=47;
        char wildcard = (char) ((Math.random() * (wildcard2 - wildcard1) + 1) + wildcard1);
        //System.out.println(wildcard);
        int lengthStr=resul.length();
        resul=resul.substring(0,3)+wildcard+resul.substring(lengthStr-3);

        return resul.substring(0,sizePassword);
    }
}
