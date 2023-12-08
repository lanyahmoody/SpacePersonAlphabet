import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


public class SpacePersonAlphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter plaintext: ");
        String plaintext = scanner.nextLine();

        String spaceText = (" *!@@&");
        System.out.println("Converted to space text:" + spaceText);

        System.out.print("Enter shift value: ");
        int shiftValue = scanner.nextInt();

        String encryptedText = encrypt(plaintext, shiftValue);
        System.out.println("Encrypted text: " + encryptedText);

        scanner.close();

    }
    public static String encrypt(String plaintext, int shift) {
        StringBuilder encryptedText = new StringBuilder();

        for (char character : plaintext.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                int originalAlphabetPosition = character - base;
                int newAlphabetPosition = (originalAlphabetPosition + shift) % 26;
                char newCharacter = (char) (base + newAlphabetPosition);
                encryptedText.append(newCharacter);
            } else {
                encryptedText.append(character);
            }
        }

        return encryptedText.toString();
    }



}
