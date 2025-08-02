class Alpha {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
           for(int k=n;k>i;k--){
               System.out.print(" ");
           }
            char ch='A';
            for(int j=1;j<=i;j++){
               if(i==j || i==5 || j==1){
                   System.out.print(ch);
               }else{
               System.out.print("_");
               }
                   ch++;
            }
            System.out.println();
        }
    }