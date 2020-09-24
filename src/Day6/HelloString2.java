package Day6;

public class HelloString2 {
    public static void main(String[] args) {
        String poema="Я памятник воздвиг себе нерукотворный";
        int dlina=poema.length();//длина строки
        System.out.println("Dlina srtoki = "+dlina);
        String preview=poema.substring(0,10);//обрезать фразу с 0 символа/начало строки по 10 символ.
        // Отсчет ведется с 0
        System.out.println(preview);
        String endPoema=poema.substring(dlina-13);//выводит последнюю букву фразы
        System.out.println(endPoema);
        char test= poema.charAt(0);//берет букву по порядковому номеру
        System.out.println(test);
        char test2=poema.charAt(dlina-1);
        System.out.println(test2);
    }
}
