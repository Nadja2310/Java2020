package Day39.uni;

public class UniUser extends Person {
    String firstName;
    private String secondName;
    String uniID;
    private int age;
    private int yearBirth;
    private double minValueSalary = 9.14;
    private double hour;
    private long accountBank;

    public UniUser(String firstName) {
        this.firstName = firstName;
    }

    public UniUser(String uniID, int age) {
        this.uniID = uniID;
        this.age = age;
    }

    public UniUser(String firstName, String secondName, String uniID, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.uniID = uniID;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAccountBank(long accountBank) {
        this.accountBank = accountBank;
    }

    public void setMinValueSalary(double minValueSalary) {
        this.minValueSalary = minValueSalary;
    }

    public int getAge() {
        return age;
    }

    public double getHour() {
        return hour;
    }

    public double getMinValueSalary() {
        return minValueSalary;
    }

    public double paySalary() {
      return getHour()*getMinValueSalary();
    }

    protected void eats() {
        System.out.println("В столовой все цены со скидкой. Скидка = ");
    }

    public void walks() {
        System.out.println("Ходит по кампусу");
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", uniID='" + uniID + '\'' +
                ", age=" + age +
                ", accountBank=" + accountBank +
                '}';
    }
}
