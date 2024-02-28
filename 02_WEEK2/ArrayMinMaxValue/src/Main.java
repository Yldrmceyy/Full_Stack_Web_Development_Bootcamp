public class Main {
    public static void main(String[] args) {

        int[] list = {56, 76, 98, 3, 2, -34, -2};
        //min= lis[0],  min < list[1] ? min = list[1] : ''
        //max= lis[0],  max > list[1] ? max = list[1] : ''
        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Minimum Value: " + min);
        System.out.println("Maximum Value: " + max);
    }
}