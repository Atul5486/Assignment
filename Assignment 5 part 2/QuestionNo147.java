class DoubleStar{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
             for(int l=1;l<=i;l++){
                System.out.print("*");
            }
            for(int j=n;j>i-1;j--){
                System.out.print(" ");
            }
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }

            for(int k=i;k>0;k--){
                System.out.print("*");
            }
           
            System.out.println();
        }

}}