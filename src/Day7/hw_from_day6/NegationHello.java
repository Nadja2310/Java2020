package Day7.hw_from_day6;

public class NegationHello {
    public static void main(String[] args) {
        boolean redButton = false;
        //isActiveMachine(redButton);
        System.out.println("Статус работы станка "+ isActiveMachine(redButton));
        System.out.println("Статус работы станка "+ isActiveMachine(true));
        
        
    }
//если красная кнопка нажата, то ее статус True
  //  если статус кнопки true, то статус метода isActiveMachine должен быть false
    private static boolean isActiveMachine(boolean stopSignal) {
        return !stopSignal;//true машина остановилась пересьаола работать
    }
}
