package Day6;

public class HelloString {
    public static void main(String[] args) {
        String student1, student2;
        double pi = Math.PI;
        student1 = "Elena Prekrasnaya";
        student2 = "Ivan Durak";
        student1.toUpperCase();
        helloUser(student1);
        helloUser(student2);
        helloUser("Du");
        char c1 = 150;
        char c2 = (char) (c1 + 20);
        System.out.println(c1 + 10);//budet 160 тут складывает значение не проебразую в символ
        System.out.println(""+c1+10);// budet Kod=10
        System.out.println("" + c2 + 10);
        boolean bool = 3 <= 5;
    }

    private static void helloUser(String userName) {
        System.out.println("Hello " + userName + " !");
    }
}
