class Star{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            
           for(int k=i;k>0;k--){
               System.out.print(" ");
           }
            for(int j=n*2-1;j>=i*2-1;j--){
                System.out.print("*");
            }
            System.out.println();
    }
        }
}