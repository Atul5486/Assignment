class Star{
    public static void main(String[] args) {
        int n=3;
        for(int i=1;i<n*2-1;i++){
            for(int k=n;k>=i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++){
                if(j%2==0)
        System.out.print("_");
                else
                System.out.print("*");
            }
            System.out.println();
            
    }
    for(int i=n*2-3;i>0;i--){
            for (int k = n; k >= i; k--) {
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++){
                if(j%2==0)
        System.out.print("_");
                else
                System.out.print("*");
            }
            System.out.println();
            
    }
}}