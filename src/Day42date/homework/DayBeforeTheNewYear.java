package Day42date.homework;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DayBeforeTheNewYear {
    public static void main(String[] args) {
        LocalDate inputDate = LocalDate.now();

        countDaysBeforeTheNewYear(inputDateString());
    }

    private static LocalDate inputDateString() {

        System.out.println("Введите дату в формате ddMMyyyy");
        Scanner input = new Scanner(System.in);
        String tempDate = input.next();
        tempDate = tempDate.substring(0, 2) + "/" + tempDate.substring(2, 4) + "/" + tempDate.substring(4);
        return LocalDate.parse(tempDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }


    private static void countDaysBeforeTheNewYear(LocalDate inputDate) {

        LocalDate newYear = LocalDate.of(inputDate.getYear(), 12, 31);
        int day = newYear.getDayOfYear() - inputDate.getDayOfYear();

        System.out.println("До Нового года осталось " + day);
    }
}
