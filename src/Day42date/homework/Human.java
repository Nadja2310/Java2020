package Day42date.homework;

import java.time.LocalDate;
import java.time.Period;

public class Human {
    private String firstName;
    private String secondName;
    private String gender;
    private LocalDate birthday;

    public Human() {
    }

    public Human(String firstName, String secondName, LocalDate birthday) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public int getAge() {
        LocalDate today = LocalDate.now();
        int age = today.getYear() - this.birthday.getYear();
        int monthAge = age * 12;
        int month = today.getMonthValue() - this.birthday.getMonthValue();
        int day = today.getDayOfMonth() - birthday.getDayOfMonth();

        if (month <= 0) {
            monthAge--;
            if (day < 0) {
                monthAge--;
            }
        }
        return monthAge / 12;
        //с помощью имееющихся методов
        //   Period period = Period.between(birthday, today);
        //   return period.getYears();
    }
}

class testHumana {
    public static void main(String[] args) {
        Human ivan1 = new Human("Ivan", "Ivanov", LocalDate.of(1985, 12, 19));
        System.out.println(ivan1);
        System.out.println("Age " + ivan1.getAge());
        Human ivan2 = new Human("Ivan", "Petrov", LocalDate.of(1985, 04, 15));
        System.out.println(ivan2);
        System.out.println("Age " + ivan2.getAge());

    }
}