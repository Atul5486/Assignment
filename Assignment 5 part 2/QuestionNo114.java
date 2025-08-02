class Number {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>0;i--){
           for(int k=n;k>i;k--){
               System.out.print(" ");
           }
            for(int j=1;j<=i;j++){
              System.out.print(i);
            }
            System.out.println();
        }
    }
}