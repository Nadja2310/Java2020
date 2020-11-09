package Day39.uni;

import java.util.Objects;

public final class Student extends UniUser {
    private String subject;
    private String formOfEducation;
    private int numberOfHours;
    private int price;

    public Student(String firstName) {
        super(firstName);
    }

    public Student(String uniID, int age, String subject) {
        super(uniID, age);
        this.subject = subject;
    }

    public Student(String firstName, String secondName, String uniID, int age) {
        super(firstName, secondName, uniID, age);
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public int getPrice() {
        return price;
    }

    private double pay() {
        return getPrice()*getHour();
    }

    @Override
    public void walks() {
        super.walks();
        System.out.print(" учиться на пары");
    }

    public void study() {
        System.out.println("Должен учиться, учиться и ещё раз учиться!");
    }

    @Override
    public void eats() {
        System.out.println("В столовой все цены со скидкой. Скидка = ");
    }

    @Override
    public String toString() {
        return super.toString() + '\'' + "Student{" +
                "subject='" + subject + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Student student = (Student) o;
        // Если имя и АйДи у объектов равны, то это два экземпляра одной СУЩНОСТИ
        return
                this.firstName.equals(student.firstName)
                        && this.uniID.equals(student.uniID);
    }

    public boolean myEquals(Student st) {
        return this.firstName.equals(st.firstName);

/*        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(subject, student.subject);*/
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject);
    }
}
