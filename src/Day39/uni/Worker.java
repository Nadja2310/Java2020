package Day39.uni;

public class Worker extends UniUser{
    private String firstName;
    private String secondName;
    private String uniID;
    private String position;
    private int age;
    private double eatCooficient = 0.8;
    private double workWeek;

    public Worker(String firstName) {
        super(firstName);
    }

    public Worker(String firstName, String secondName, String uniID, int age, double workWeek) {
        super(firstName, secondName, uniID, age);
        this.workWeek = workWeek;
    }

    public Worker(String uniID, int age) {
        super(uniID, age);
    }

    public void works() {
        System.out.println("Работать!");
    }

}
