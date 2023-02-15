import java.util.Stack;

public class Decoder {
    public static void decoder(String ciphertext, int divideSequence) {
        Stack<Character> decoding = new Stack<>();

        int part = ciphertext.length() / divideSequence;

        for (int i = 0; i < part; i++) {
            for (int j = i * divideSequence; j < divideSequence + i * divideSequence; j++) {
                decoding.push(ciphertext.charAt(j));
            }
            for (int j = i * divideSequence; j < divideSequence + i * divideSequence; j++) {
                System.out.print(decoding.pop());
            }
        }

        for (int i = part * divideSequence; i < ciphertext.length(); i++) {
            decoding.push(ciphertext.charAt(i));
        }

        for (int i = part * divideSequence; i < ciphertext.length(); i++) {
            System.out.print(decoding.pop());
        }
    }
}
