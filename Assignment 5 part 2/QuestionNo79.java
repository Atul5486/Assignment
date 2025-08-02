class Zero{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
           String str=(j%2==0) ? "0":"1";
           System.out.print(str);
            }
            System.out.println();
        }
    }
}
