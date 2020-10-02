package Day19;

import Day19.golde_hands.TilesApplication;

public class HW17GoldenHands {
    public static void main(String[] args) {
        final double MASTER_PRICE_PRO_METR2_PRO_HOUR = 27.0;
        double tilesWidth = 20.0; //razmer plitki
        double tilesLenght = 30.0;
        // 'эти данные дает клиент по телефону
        double roomWidth = 5.5;
        double roomLength = 7.5;
        double tilesPrice = 3.0;
        TilesApplication.startApplication(tilesWidth ,tilesLenght,roomWidth,roomLength,tilesPrice,MASTER_PRICE_PRO_METR2_PRO_HOUR);

    }
}
