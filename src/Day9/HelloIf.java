package Day9;

public class HelloIf {
    public static void main(String[] args) {

        ifintroductionOne();
        ifintroductionTwo();
        ifintroductionThree();

    }
    private static void ifintroductionThree() {
        int age=30;

        if (age <16) {
            System.out.println("Категорически запрещено продавать алкоголь");
        } else if(age>=16 && age<18) {
            System.out.println("Слабый алкоголь можно продавать");
        }
        else
        {
            System.out.println("Можно продавать крепкий алкоголь");
        }
    }

    private static void ifintroductionTwo() {
        if (3 > 5) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    private static void ifintroductionOne() {
        boolean permission = false;
        boolean prohibitionDenyDe = true;

        if (permission) {//(иначе это означает permission == true)
            System.out.println("Можно поехать в лагерь");
        } else {
            System.out.println("Остаемся дома");
        }
    }
}
