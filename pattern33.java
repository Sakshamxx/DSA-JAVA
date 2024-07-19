public class pattern33 {
    public static void main(String[] args) {
        int n = 10; // Number of rows

        for (int i = 1; i <= n-1; i++) {
            // Print leading spaces
            for (int k = 0; k < n - i; k++) {
                System.out.print("\t");
            }
            // Print numbers
            for (int j = 1; j <= i ; j++) {
                if (j == i) {
                    System.out.print( "\t");
                } else {
                    System.out.print((n-i+j)+"\t");
                }
            }
            System.out.println();
        }
    }
}