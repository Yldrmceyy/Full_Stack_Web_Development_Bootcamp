import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};

        int[] frequency = new int[list.length];

        for (int i = 0; i < list.length; i++) {
            int count = 0;
            for (int j = 0; j < list.length; j++) {
                if (list[i] == list[j]) {
                    count++;
                }
            }
            frequency[i] = count;

        }
        System.out.println(Arrays.toString(frequency));

        for (int i = 0; i < list.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (list[i] == list[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.println(list[i] + " sayısı " + frequency[i] + " kere tekrar edildi");
            }
        }
    }
}
