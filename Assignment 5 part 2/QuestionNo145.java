class StarSpace{
    public static void main(String[] args) {
        int n=3;
        for(int i=1;i<n*2-1;i++){
            for(int k=n;k>=i;k--){
                System.out.print(" ");
            }   
            for(int j=1;j<=i*2-1;j++){
                if(j==i*2-1 || j==1 || i==n*2-1){
                System.out.print("*");
                }else
            System.out.print("_");
            }
            System.out.println();
            
    }
    for(int i=n*2-3;i>0;i--){
            for (int k = n; k >= i; k--) {
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++){
                if(j==i*2-1 || j==1 || i==n*2-1){
                System.out.print("*");
                }else
            System.out.print("_");
            }
            System.out.println();
            
    }
}}