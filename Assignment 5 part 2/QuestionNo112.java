class Number {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
           for(int k=n;k>i;k--){
               System.out.print(" ");
           }
            for(int j=1;j<=i;j++){
               if(j%2==0)
               System.out.print("0");
               else
               System.out.print("1");
            }
            System.out.println();
        }
    }
}