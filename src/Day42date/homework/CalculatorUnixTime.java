package Day42date.homework;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalculatorUnixTime {
    public static void main(String[] args) {

        System.out.println("Unix time =" + countUnixTime(inputDateString()));
    }

    private static long countUnixTime(LocalDate inputDate) {
       long day = 86400;//1 день = 86400 секунд 1041372639 1071704958
       long year = 31_556_926L;//1 год (365.24 дней) = 31556926 секунд

        return (day * inputDate.getDayOfYear() + (inputDate.getYear() - 1970) * year);
    }

    private static LocalDate inputDateString() {

        System.out.println("Введите дату в формате ddMMyyyy");
        Scanner input = new Scanner(System.in);
        String tempDate = input.next();
        tempDate = tempDate.substring(0, 2) + "/" + tempDate.substring(2, 4) + "/" + tempDate.substring(4);
        return LocalDate.parse(tempDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    private static LocalDate inputDate() {
        LocalDate inputD = LocalDate.now();
        System.out.println("Введите дату в формате dd/MM/yyyy");
        Scanner input = new Scanner(System.in);
        inputD = LocalDate.parse(input.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        input.close();
        return inputD;
    }
}
