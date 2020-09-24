package Day12;

public class HomeWork12 {
    public static void main(String[] args) {
        String city,weekday;
        city="Минск";
        weekday="Понедельник";
        System.out.println("Погода в "+city+" в "+weekday+citiWeather(city,weekday));
        city="Берлин";
        weekday="Суббота";
        System.out.println("Погода в "+city+" в "+weekday+citiWeather(city,weekday));
    }

    private static int weekday(String inputWeekday) {
        switch (inputWeekday) {
            case "Понедельник":
                return 0;
            case "Вторник":
                return 1;
            case "Среда":
                return 2;
            case "Четверг":
                return 3;
            case "Пятница":
                return 4;
            case "Суббота":
                return 5;
            case "Воскресенье":
                return 6;
            default:
                return -256;
        }

    }

    //Нам известно, что в Берлине в понедельник было 20 градусов тепла,
    //в Лондоне 17 градустов тепла,
    //в Лиссабоне 25 градусов тепла,
    //в Париже 23 градуса тепла,
    //в Москве 19 градусов тепла,
    //в Минске 18 градусов тепла,
    //в Саратове 15 градусов тепла.
    private static int citiWeather(String city, String weekday) {
        int temp = 0;
        switch (city) {
            case "Лондон":
                temp = 17 + weekday(weekday);
                break;
            case "Лиссабон":
                temp = 25 + weekday(weekday);
                break;
            case "Париж":
                temp = 23 + weekday(weekday);
                break;
            case "Москва":
                temp = 19 + weekday(weekday);
                break;
            case "Минск":
                temp = 18 + weekday(weekday);
                break;
            case "Саратов":
                temp = 15 + weekday(weekday);
                break;
            case "Берлин":
                temp = 20 + weekday(weekday);
                break;
        }
        return temp;
    }
}
