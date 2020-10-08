package Day23;

public class StartApplication {
    public static void main(String[] args) {
        int hexValue1 = 0x100; // Шестнадцатеричная система счисления
        int binar = 0B1001_1001; // Двоичная система счисления
        int octal = 0757; // восьмеричная система счисления

        int decimalNumber=100;
        String myBinaryNumber = Converter.convertDecimalToBinarz(decimalNumber);
        System.out.println("Результат работы конвертера "+myBinaryNumber);

        int myDecimalNumber = Converter.convertBinaryToDecimal("1100100");
        System.out.println("Результат работы конвертера "+myDecimalNumber);


        //split() посмотреть 30 мин как скопировали метод
    }
}
