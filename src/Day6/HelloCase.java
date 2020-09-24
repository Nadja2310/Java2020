package Day6;

public class HelloCase {
    public static void main(String[] args) {
        //hellouppercase();
        anotherHello();

    }

    private static void anotherHello() {
        System.out.println("andrey".toUpperCase());//так не красиво забудешь.
        // лучше все делать через переменную
        String teacher ="Andrey";
        System.out.println(teacher.toUpperCase());
    }

    private static void hellouppercase() {
        String sourse = "london is the capital of great britain";
        System.out.println(sourse);
        String phrase2 = sourse.toUpperCase();//первая буква боьшая. преобразуем любую букву в боьлшую
        System.out.println(phrase2);
        String phrase3 = sourse.substring(0, 1).toUpperCase() + sourse.substring(1).toLowerCase();
        //делаенм начало строки с большой буквы а остальное с маленькой
        System.out.println(phrase3);
    }
}
