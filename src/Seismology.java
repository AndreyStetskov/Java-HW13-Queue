import java.util.*;

public class Seismology {

    public void tracking() {
        Queue<Integer> tremors = new LinkedList<>();

        List<Integer> magnitudes = new ArrayList<>();
        magnitudes = managementStation();

        int criticalNumberOfMagnitude = 0;
        int index = 0;

        while (magnitudes.get(index) != -97) {
            if (magnitudes.get(index) > 3) {
                tremors.offer(magnitudes.get(index));
                criticalNumberOfMagnitude ++;
            }
            index++;
        }

        if (criticalNumberOfMagnitude > 5) {
            System.out.println("During the time you were on duty, it was recorded: " + criticalNumberOfMagnitude + " tremors:");
            while ((tremors.peek()) != null) {
                System.out.println(tremors.poll());
            }
            System.out.println("Attention!! There may be an earthquake!");
        }
    }

    private static List<Integer> managementStation() {
        Random random = new Random();

        List<Integer> magnitudes = new ArrayList<>();

        int numberOfMeasurements = random.nextInt(5, 15);

        System.out.println("Control station:");
        for (int i = 0; i < numberOfMeasurements; i++) {
            magnitudes.add(random.nextInt(0, 10));
            System.out.println(magnitudes.get(i));
        }
        magnitudes.add(-97);
        System.out.println("-97");
        return magnitudes;
    }
}
