public class pattern33 {
    public static void main(String[] args) {
        int m=10;
        for (int i = 1; i <=m; i++) {
            for(int k=1;k<=m-i;k++){
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                if(i==j) System.out.print(0+" ");
                else System.out.print(m-i+j+" ");
            }
            for (int j = 2; j <=i; j++) {
                System.out.print(m-j+1+" ");
            }
            System.out.println();
        }
    }
}