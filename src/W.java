public class W {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((j == 0 && i < n) || (i == j && i > n / 2) || (i + j == (n - 1) && j < n / 2) || (j == (n - 1) && i < n)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}