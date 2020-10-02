package Day18;

public class ReviewString {
    public static void main(String[] args) {
        firstREview();
    }

    private static void firstREview() {
        String hm="Василия";
   /*     System.out.println(hm.indexOf(1103));//то код буквы Я тоже вывведет букву Я
        System.out.println(hm.indexOf('я'));
        System.out.println(hm.codePointAt(6));//1103 место буквы я в таблице char
        System.out.println('ю'+0); //узнaть код этой буквы в char
*/
        if (hm.codePointAt(6)=='я'){
            System.out.println("popal");
        }

    }

}
