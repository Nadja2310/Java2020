package Day9;

public class ClassWork {
    public static void main(String[] args) {
        //Напишите программу действий для сотрудника дорожной полиции, который остановил машину:
        //при езде до 50 км/час нарушений нет;
        //за езду от 50 км/час до 65 км/час — устное порицание и лекция на 5 минут;
        //за превышение скорости от 16 км/час — 40 евро штрафа;
        //за езду от 100 км/час до 130 км/час — штраф 500 евро;
        //и за езду свыше
        int mySpeed = 50;
        ifPravilaPolicia(mySpeed);
    }

    private static void ifPravilaPolicia(int mySpeed) {
        if (mySpeed <= 50) {
            System.out.println("нарушений нет");
        } else if (mySpeed <= 65) {
            System.out.println("устное порицание и лекция на 5 минут");
        } else if (mySpeed <= 100) {
            System.out.println("40 евро штрафа");
        } else if (mySpeed <= 130) {
            System.out.println("штраф 500 евро");
        }
        else{
            System.out.println("штраф 500 евро и лишение прав");
        }
    }
}
