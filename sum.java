public class sum {
    public static void main(String[] args) {
        int[] n = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int num : n) {
            sum += num;
        }

        System.out.println("Sum of elements in the array: " + sum);
    }
}
