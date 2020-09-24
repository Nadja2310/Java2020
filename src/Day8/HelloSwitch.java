package Day8;

public class HelloSwitch {
    public static void main(String[] args) {
        int scholNote = 4;

        System.out.println(bonus(scholNote));

    }

    private static String bonus(int note) {
        String output = "";

        switch (note) {
            case 5:
                output = "Fahrrad";
                break;
            case 4:
                output = "GoPro7";
                break;
            case 3:
                output = "kein Geschenkt";
                break;
            case 2:
                output = "Lernen!!!";
                break;
            case 1:
                output = ":((((";
                break;
            default:
                output = "такой оценки нет!";
                break;
        }
return output;
    }
}

