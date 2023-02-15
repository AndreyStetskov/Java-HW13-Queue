import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a message: ");
        String textForDecryption = scan.nextLine();

        System.out.println("Enter a key: ");
        int key = scan.nextInt();

        Decoder.decoder(textForDecryption, key);


        System.out.println("------------------------------------------------------------");


        Seismology today = new Seismology();
        today.tracking();
    }
}