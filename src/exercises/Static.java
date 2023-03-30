package exercises;

public class Static {
    public static void main(String[] args) {
        int nums[] = {3, 6, 8, 10, 4, 1, 3, 7, 12};
        int total = 0;
        for (int i : nums) {
            if (i % 2 == 0) {
                total += i;
            }
        }
        System.out.println(total);
    }

}
