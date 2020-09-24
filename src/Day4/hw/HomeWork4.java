package Day4.hw;

public class HomeWork4 {
    public static void main(String[] args) {
        char simbo1;
        simbo1 = 200;
        printSimbolChar(simbo1);
        simbo1 = '\u263A';
        printSimbolChar(simbo1);
        simbo1 = '\u058E';
        printSimbolChar(simbo1);
        simbo1 = '\u00A7';//\0x28';
        printSimbolChar(simbo1);
        simbo1 = '\u00A9';
        printSimbolChar(simbo1);
        simbo1 = '\u2649'; //телец
        printSimbolChar(simbo1);
        simbo1 = '\u2655';//шахматы
        printSimbolChar(simbo1);
        simbo1 = '\u2665';//червы
        printSimbolChar(simbo1);

        String myName, myArg;
        // Вывести на экран сообщение в кавычках. Например собственное имя + "профессия".
        String myName1,myProf;
        myName1="Nadezda ";
        myProf="programmer";

        System.out.println("Name "+myName1+" profession "+ myProf);
        //Вывести на экран построчно анкетные данные: Имя, Фамилия, Адрес, Улица и тд и тп.
        myArg="Name";
        myName="Nadezda ";
        printNAme(myName,myArg);
        myArg="Surname";
        myName="Maksakova";
        printNAme(myName,myArg);
        myArg="Address";
        myName="Berlin,Kanzowstr.";
        printNAme(myName,myArg);

    }

    private static void printNAme(String myName, String myArg) {
        System.out.println(myArg+" "+myName);
    }

    private static void printSimbolChar(char simbol) {

        System.out.println("Код " + simbol + " = " + (int) simbol);
    }
    //Что будет, если "сложить" переменную String с самой собой? Можно ли умножить её на саму себя? Почему?
    //Складывание строк означает склеивание их. Умножать строки нельзя, их только складывают.

}
