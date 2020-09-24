package Day12;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class HomeWorkString12 {
    public static void main(String[] args) {
        String str = "Home work 12.09.2020";
        String str1 = "work my!";
        String podstr = "12.09.2020";
        if (str.contains(podstr)) {
            System.out.println("Строка " + str + " сожержит строку " + podstr);
        }

        if (str.startsWith("Ho")) {
            System.out.println("Строка " + str + " начинается с символов " + "Ho");
        }
        ;
        if (str1.endsWith("!")) {
            System.out.println("Строка " + str1 + " заканчивается символом " + "!");
        }
        System.out.println("Напечатаем строку всю маленькими буквами "+str.toLowerCase());
        System.out.println("Напечатаем строку всю большими буквами "+str.toUpperCase());
    /*equals(Object anObject) //С классом String так и поступили. У него есть переопределенный метод
    equals(). И сравнивает он не ссылки, а именно последовательность символов в строках.
    И если текст в строках одинаковый, неважно, как они были созданы и где хранятся:
    в пуле строк, или в отдельной области памяти. Результатом сравнения будет true.

    substring(int beginIndex)
    toLowerCase()
    toUpperCase()
    trim() удаляет пробелы в начале и конце строки!!!!*/
    }

}
