package Day17;

import java.util.Scanner;

public class ScannerHW17 {
    public static void main(String[] args) {
        //Scanner
        //Напишите программу, которой надо представиться.
        // Данные, которые спрашивает машина: имя, фамилия, пол, возраст, e-mail.
        // Для считывания данных типа String используйте метод next(): input.next()
//5infoUser();

        //Компьютер загадывает число от 1 до n. У пользователя k попыток отгадать.
        // После каждой неудачной попытки компьютер сообщает меньше или больше загаданное число.
        // В конце игры текст с результатом (или “Вы угадали”, или “Попытки закончились”).
        int k=5;
        System.out.println(guessTheNumber(k));

    }
private static int computerNumber(){
        int num=0;
        return (int) (Math.random()*10);
}
    private static String guessTheNumber(int k) {
        System.out.println("Введите число до 10");
        Scanner input=new Scanner(System.in);
        int x;
        int rez=0;
        int numComp=computerNumber();
        //System.out.println("rrrr  "+numComp);
        for (int i = 0; i < k; i++) {
            x=input.nextInt();
            if (numComp==x){
              return "Угадали!!! Число "+numComp;
            }else if (numComp>x){
                System.out.println("загаданное число больше на "+(numComp-x));
            }else if (numComp<x){
                System.out.println("загаданное число меньше на "+(x-numComp));
            }
        }
        input.close();
        return "Попытки закончились.";
    }

    private static void infoUser() {
        Scanner input=new Scanner(System.in);

        String name,vorname,geschlecht,alt,mail;
        System.out.println("Enter surname");
        name=input.next();
        System.out.println("Enter name");
        vorname=input.next();
        System.out.println("Enter sex(male or female)");
        geschlecht=input.next();
        System.out.println("Enter age");
        alt=input.next();
        System.out.println("Enter e-mail");
        mail=input.next();
        input.close();
        System.out.println("User info");
        System.out.println(name+" "+vorname+" "+geschlecht+" "+alt);
        System.out.println(mail);


    }
}
