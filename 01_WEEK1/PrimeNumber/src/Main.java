

public class Main {
    public static void main(String[] args) {

        int n;

        for (n = 2; n <= 100; n++) {
            int count = 0;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(n);
            }
        }
    }
}
