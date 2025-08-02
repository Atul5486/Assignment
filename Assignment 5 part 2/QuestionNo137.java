class Number{
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>0;i--){
            
           for(int k=i;k<n;k++){
               System.out.print(" ");
           }
            for(int j=1*2-1;j<=i*2-1;j++){
                if( j==i*2-1 || j==1 || i==n)
                System.out.print(j);
                else
                System.out.print(" ");
            }
            System.out.println();
    }
        }
}