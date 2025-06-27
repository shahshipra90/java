public class even_number {
    public static void main(String[] args) {
        int[] n = {10, 15, 22, 33, 42, 55};

        for (int num : n) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}
