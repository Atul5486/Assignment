class Star{
    public static void main(String[] args) {
        int n=5;
        char ch='A';
        for(int i=1;i<=n;i++){
           for(int k=n;k>i;k--){
               System.out.print(" ");
           }
            for(int j=1;j<=i*2-1;j++){
                if(j==i)
                System.out.print("#");
                else
                System.out.print("*");
            }
            System.out.println();
            ch++;
        }
    }
}