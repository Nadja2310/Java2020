package Day19.golde_hands;

public class TilesApplication {
    public static void startApplication(double tilesWidth, double tileslenght, double roomWidth, double roomLenght,
                                        double tilesPrice, double masterPrice) {
        double square = roomLenght * roomWidth;

        int tilesQuantity = getMeTilesQuantity(roomLenght, roomWidth, tileslenght, tilesWidth);//сколько плитки
        System.out.println("Техническая распечатка.Количество плиток  " + tilesQuantity);
        double sumWorkHour = getMeSumWorkHour(square, masterPrice);
        double sumMaterialCost = getMeMAterialCost(tilesPrice, tilesQuantity);
        double totalSum = sumWorkHour + sumMaterialCost;
        //как посчитать поломанные
        int wholeTiles=getMeWholeTilesQuantity(roomLenght, roomWidth, tileslenght, tilesWidth); //Дать количество целых плитолк, которые не надо резать
        System.out.println("Количество целых плиток "+wholeTiles);
        int brokenTiles=tilesQuantity-wholeTiles;
        System.out.println("Количество резанных плиток "+brokenTiles);

        //теперь считаем поперек
        int tilesQuantitySecond=getMeTilesQuantity(roomWidth,roomLenght,tileslenght,tilesWidth);
        int wholeTilesSecond =getMeWholeTilesQuantity(roomWidth,roomLenght,tileslenght,tilesWidth);
        int brokenTilesSecond=tilesQuantitySecond-wholeTilesSecond;
        System.out.println("Поперек.Количество всех плиток"+tilesQuantitySecond);
        System.out.println("Поперек.Количество целых плиток"+wholeTilesSecond);
        System.out.println("Поперек.Количество резанных плиток"+brokenTilesSecond);
    }

    private static int getMeWholeTilesQuantity(double roomLenght, double roomWidth, double tileslenght, double tilesWidth) {
        tileslenght = tileslenght / 100;//переводим см в метры
        tilesWidth = tilesWidth / 100;

        int countTilesInOneLineLenght = (int) Math.floor(roomLenght / tileslenght);//количество плиток на стенку
        int countTilesInOneLineWidth = (int) Math.floor(roomWidth / tilesWidth);
        int result = countTilesInOneLineLenght * countTilesInOneLineWidth;
        return result; //675
    }

    private static double getMeMAterialCost(double tilesPrice, int tilesQuantity) {

        return tilesPrice * tilesQuantity;
    }

    private static double getMeSumWorkHour(double square, double masterPrice) {
        return square*masterPrice;
    }

    private static int getMeTilesQuantity(double roomLenght, double roomWidth, double tileslenght, double tilesWidth) {
        tileslenght = tileslenght / 100;//переводим см в метры
        tilesWidth = tilesWidth / 100;

        int countTilesInOneLineLenght = (int) Math.ceil(roomLenght / tileslenght);//количество плиток на стенку
        int countTilesInOneLineWidth = (int) Math.ceil(roomWidth / tilesWidth);
        int result = countTilesInOneLineLenght * countTilesInOneLineWidth;
        return result;
    }
}
