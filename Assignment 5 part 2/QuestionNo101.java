class Star{
    public static void main(String[] args) {
        int n=5,k=1;
        for(int i=1;i<=n;i++){
                for(int j=1;j<=k;j++){
                    System.out.print("*");
                }
                
            System.out.println();
                    k+=i;
        }
    }
}