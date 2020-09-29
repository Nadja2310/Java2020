package Day16;

public class HomeWork16 {
    public static void main(String[] args) {
        System.out.println(enigmaCaesar("Съешь же ещё этих мягких французских булок, да выпей чаю."));

    }

    public static int searchСode(char inputBukva) {
        String alphabet = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        char codeBukva;
        int number = 0;
        alphabet = alphabet.toLowerCase();
        number = alphabet.indexOf(inputBukva);
        return number;
    }

    //провнрим какая буква большая или маленькая
    public static boolean searchUpp(int indBukva, char bukva) {
        String alphabet = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        String alphabetLower = alphabet.toLowerCase();
        return alphabet.charAt(indBukva) == bukva;

    }

    public static char codeCode(int numer, boolean lowUpp) {
        String codeAlphabet = "ГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯАБВ";
        String codeAlphabetLower = codeAlphabet.toLowerCase();
        return (lowUpp ? codeAlphabet.charAt(numer) : codeAlphabetLower.charAt(numer));
    }

    private static String enigmaCaesar(String inputStr) {

        //y=(x+k)\mod \ n
        //x=(y-k) mod \ n,
        //где {\displaystyle x}x — символ открытого текста,
        // y — символ шифрованного текста, n — мощность алфавита, а k — ключ.
        System.out.println("Input string"+inputStr);
        String outputStr = "";
        char bukva;
        int codeBukva;
        String inputStrLower = inputStr.toLowerCase();
        for (int i = 0; i < inputStr.length(); i++) {
            bukva = inputStrLower.charAt(i);
            if (bukva == ' ' || bukva == '-' || bukva == ',' || bukva == '.') {
                outputStr += bukva;
            } else {
                codeBukva = searchСode(bukva);
                boolean bukvaUpp = searchUpp(codeBukva, inputStr.charAt(i));
                outputStr += codeCode(codeBukva, bukvaUpp);
            }
        }
        return outputStr;
    }
}
