class Xreverse {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= 2 * n - 1; i++) {
            int count = i <= n ? i : 2 * n - i;
            for (int j = 1; j <= count; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

