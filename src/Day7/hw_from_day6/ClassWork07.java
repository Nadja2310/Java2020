package Day7.hw_from_day6;

public class ClassWork07 {
    public static void main(String[] args) {
        System.out.println(smartDepositBox(true, false)); //-> true
        System.out.println(smartDepositBox(false, true)); //-> true
        System.out.println(smartDepositBox(false, false));// -> false

        split();
        System.out.println(smartDepositBoxVersionTwo(true, false));// -> false
        System.out.println(smartDepositBoxVersionTwo(false, true));// -> false
        System.out.println(smartDepositBoxVersionTwo(false, false));// -> false
        System.out.println(smartDepositBoxVersionTwo(true, true));//-> true
        split();
        boolean mamaPermission, papaPermission, omaPermission;
        mamaPermission = true;
        papaPermission = false;
        omaPermission = true;
        System.out.println(verySmartDepositBoxVersionThree(mamaPermission, papaPermission, omaPermission));
        split();
        System.out.println(bigBadaBoom(true, true));// -> true
        System.out.println(bigBadaBoom(false, false));// -> false
        System.out.println(bigBadaBoom(true, false));// -> false
        split();
        System.out.println(doorbell(true, true));// -> false
        System.out.println(doorbell(false, false));// -> false
        System.out.println(doorbell(true, false));// -> true
        boolean electro=true;
        boolean internet=true;
        System.out.println(smartDoorCheckKey(true, true)); //false решили что ключом можно воспользоваться только если нет интернета и электричества
        System.out.println(smartDoorCheckKey(true, false));//false
        System.out.println(smartDoorCheckKey(false, true));//false
        System.out.println(smartDoorCheckKey(false, false));//true
    }
//6. Программирование всё больше захватывало семью Василия и они решили сделать полностью умный дом. Для
//начала они решили сделать входную дверь учитывая новые стандарты. Дверь больше нельзя открыть обычным
//ключом, пока в доме есть интернет и она подключена к электросети. Напишите тесты для программы
//smartDoorCheckKey. Заказчик(бабушка Василия), хочет, что бы мы проконтролировали работу сторонней фирмы.
    private static boolean smartDoorCheckKey(boolean electro, boolean internet) {
        return !(electro||internet);
    }
//5. На даче у родителей Васи Сидорова решили поставить звонок, который должен звонить при нажатии на кнопку
//звонка у калитки или у двери дома. Если соседские дети начинают играться и нажимать на кнопки звонка
//одновременно и на калитке и на доме, звонок не должен реагировать. Напишите программу управления звонком.

    private static boolean doorbell(boolean bellOne, boolean bellTwo) {
     return bellOne^bellTwo;
    }


    //4. Родители Василия добились успехов в программировании и смогли передать свои знания сыну. Василий вырос и
//запрограммировал систему аварийного уничтожения первых космических кораблей земли, улетевших в АльфаЦентавру.
// Система уничтожения реагирует на ввод команд двух старших офицеров корабля
    private static boolean bigBadaBoom(boolean k1, boolean k2) {
        return k1 & k2;
    }

    //3. К родителям Васи Сидорова приехала Бабушка и сказала, что родители не умеют воспитывать сына и она сама знает,
//когда давать ребёнку деньги. Напишите программу выдачи денег Васе, если бабушка выдаёт деньги независимо от
//решения родителей. одна проблема в одном методе. чтобы не путаться. Использовать уже имеющийся метод

    private static boolean verySmartDepositBoxVersionThree(boolean mamaPermission, boolean papaPermission, boolean omaPermission) {
        //return mamaPermission && papaPermission||omaPermission;
        return omaPermission || smartDepositBox(mamaPermission, papaPermission);
    }
    //2. После покупки сейфа в семье начался разлад по поводу выделению сыну денег и родители решили сейф
    //перепрограммировать, таким образом, что бы он выдавал деньги только при обоюдном согласии родителей.

    private static boolean smartDepositBoxVersionTwo(boolean a, boolean b) {
        return a & b;
    }

    //1. Родители Васи Сидорова купили умный сейф и запрограммировали его на выдачу денег по отпечатку пальцев
//одного из родителей.
    private static boolean smartDepositBox(boolean b1, boolean b2) {
        boolean c = b1 | b2;
        return c;
    }

    private static void split() {
        System.out.println("**************");
    }

}
