public class pattern31 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - i - 1) {
                    System.out.print((n - j) + " ");
                } else if (j == n - i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print((n - (j - 1)) + " ");
                }
            }
            System.out.println();
        }
    }
}
