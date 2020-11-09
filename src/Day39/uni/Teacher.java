package Day39.uni;


public class Teacher extends UniUser {
    private String subject;
    private String position;
    private int range;
    private String degree;

    public Teacher(String firstName) {
        super(firstName);
    }

    public Teacher(String firstName, String secondName, String uniID, int age, int range) {
        super(firstName, secondName, uniID, age);
        this.range = range;
    }

    @Override
    public void walks() {
        super.walks();
        System.out.print("в класс учить стадентов.");
    }

    public void teach() {
        System.out.println("Должен учиться, учиться и ещё раз учиться!");
    }
}
