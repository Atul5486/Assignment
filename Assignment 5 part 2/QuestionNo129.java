class SpaceNumber{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
           for(int k=n;k>i;k--){
               System.out.print(" ");
           }
            for(int j=1;j<i*2;j++){
                if(i==n ||j==(i*2)-1 || j==1)
                  System.out.print("1");
                  else
                  System.out.print("*");
            }
            System.out.println();
        }
    }
}