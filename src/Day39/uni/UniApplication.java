package Day39.uni;

public class UniApplication {
    public static void main(String[] args) {
        //inheritanceIntroduction();
        UniUser sasha = new Student("Саша", "Егоров", "2345", 23);
        UniUser masha = new Teacher("Маша", "Пупкина", "7654", 45, 5);
        UniUser glasha = new Worker("Глаша", "Русова", "3267", 32, 8);
        UniUser pasha = new Student("Паша", "Иванов", "6764", 27);
        UniUser sergej = new Student("Сергей", "Оволов", "9853", 20);
        UniUser andrej = new Teacher("Андрей", "Кокора", "9843", 60, 10);
        Teacher katya = new Teacher("Катя", "Кокора", "9856", 30, 1);

        masha.setHour(102.0);
        masha.setMinValueSalary(13.65);
        System.out.println("Salary " + masha.paySalary());
        UniUser[] neArray = new UniUser[]{sasha, masha, glasha, pasha, sergej};

        printArray(deleteElement(neArray, "Паша"));
        UniUser[] addArray = additionElement(neArray, andrej);

        System.out.println("______________");
        addArray = additionElement(addArray, katya);
        printArray(addArray);

        System.out.println("_____chang_________");
        changFirstName(addArray, "Кая", 32, 28595959);
        System.out.println("_____chang_________");
        changFirstName(addArray, "Катя", 32, 28595959);
        printArray(addArray);

    }

    private static UniUser findByFirstName(UniUser[] array, String firstName) {
        for (int i = 0; i < array.length; i++) {
            UniUser findTemp = array[i];
            if (findTemp.firstName == firstName) {
                return findTemp;
            }
        }
        return null;
    }

    private static void changFirstName(UniUser[] array, String firstName, int newAge, long newBankAccount) {
        UniUser changElement = findByFirstName(array, firstName);
        if (changElement != null) {
            changElement.setAccountBank(newBankAccount);
            changElement.setAge(newAge);
        }else System.out.println("Firstname "+firstName+" not find!!");
    }

    private static UniUser[] additionElement(UniUser[] array, UniUser newElement) {
        UniUser[] output = new UniUser[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            output[i] = array[i];
        }
        output[array.length] = newElement;
        return output;
    }

    private static UniUser[] deleteElement(UniUser[] array, String firstName) {
        UniUser[] output = new UniUser[array.length - 1];
        int deleteIndex = 0;
        for (int i = 0; i < array.length; i++) {
            UniUser temp = array[i];
            if (temp.firstName == firstName) {
                deleteIndex = i;
                break;
            }
        }
        for (int i = 0; i < deleteIndex; i++) {
            output[i] = array[i];
        }
        for (int i = deleteIndex; i < output.length; i++) {
            output[i] = array[i + 1];
        }
        return output;
    }

    private static void printArray(UniUser[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
