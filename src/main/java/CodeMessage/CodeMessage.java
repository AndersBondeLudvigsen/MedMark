package CodeMessage;

public class CodeMessage {
    private String plainText;
    private int[] ciphers;
    private int shiftValue;

    public CodeMessage(String plainText, int shiftValue) {
        this.plainText = plainText;
        this.shiftValue = shiftValue;
        this.ciphers = convertPlainTextToCiphers();
    }

    private int charToNumber(char character) {
        if (Character.isUpperCase(character)) {
            return character - 'A' + 1;
        } else if (Character.isLowerCase(character)) {
            return character - 'a' + 1;
        } else {
            throw new IllegalArgumentException("Input should be an uppercase or lowercase letter.");
        }
    }

    private int[] convertPlainTextToCiphers() {
        int[] result = new int[plainText.length()];

        for (int i = 0; i < plainText.length(); i++) {
            result[i] = charToNumber(plainText.charAt(i));
        }

        return result;
    }

    public void printCiphers() {
        System.out.print("Ciphers: ");
        for (int cipher : ciphers) {
            System.out.print(cipher + " ");
        }
        System.out.println();
    }
}
