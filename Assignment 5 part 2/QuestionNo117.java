class Alpha {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>0;i--){
            char ch='A';
           for(int k=n;k>i;k--){
               System.out.print(" ");
           }
            for(int j=1;j<=i;j++){
              if(i==j || i==5 || j==1){
                  System.out.print(ch);
              }else
              System.out.print("_");
                  ch++;
            }
            System.out.println();
        }
    }
}