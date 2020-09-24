package Day8;

public class HelloMyFirstCalendar {
    public static void main(String[] args) {

        String monthInput = "May";
        System.out.println("Input: "+ monthInput+" output: "+getMeMonthNumber(monthInput));

    }

    private static int getMeMonthNumber(String month) {
        int result = 0;
        month=month.substring(0,1).toUpperCase()+month.substring(1).toLowerCase();
        switch (month) {
            case "January":
                result = 1;
                break;
            case "February":
                result = 2;
                break;
            case "Marz":
                result = 3;
                break;
            case "April":
                result = 4;
                break;
            case "May":
                result = 5;
                break;
            case "June":
                result = 6;
                break;
            case "July":
                result = 7;
                break;
            case "August":
                result = 8;
                break;
            case "September":
                result=9;
                break;
            case "Oktober":
                result=10;
                break;
            case "November":
                result=11;
                break;
            case "Dezember":
                result=12;
                break;
            default:
                result= -1;
                break;


        }
        return result;
    }
}
