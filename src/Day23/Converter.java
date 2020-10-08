package Day23;

import javax.imageio.ImageTranscoder;

public class Converter {
    public static int convertBinaryToDecimal(String binaryNumber) {
        // %10
        //math.pow()
        // /10
        //while
        //мой вариант
        double resultDecimal = 0;
        int i = 0;
        while (i < binaryNumber.length()) {
            int f = Integer.parseInt(binaryNumber.substring(i,i+1));
            resultDecimal= resultDecimal+ f * Math.pow(2, binaryNumber.length()-i-1);
            i++;

        }
        return (int)resultDecimal;

        //varint uchitelya
        /*int decimalResult = 0;
        int power = 0;
        int binary = Integer.parseInt(binaryNumber); //10010001
        while (binary > 0) {
            int remainder = binary % 10;
            decimalResult = (int) (decimalResult + remainder * Math.pow(2, power));
            binary = binary / 10;
            power++;
        }*/
        //return decimalResult;

    }

    public static String convertDecimalToBinarz(int numberDecimal) {
        String resultBinary = "";
        int remainder;
        while (numberDecimal > 0) {
            remainder = numberDecimal % 2;
            resultBinary = remainder + resultBinary;
            numberDecimal = numberDecimal / 2;
        }

        return resultBinary;
    }
}
