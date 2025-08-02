class SpaceAlpha{
    public static void main(String[] args) {
        int n=5;
        char ch='A';
        for(int i=1;i<=n;i++){
           for(int k=n;k>i;k--){
               System.out.print(" ");
           }
            for(int j=1;j<=i*2-1;j++){
                if(j==1 || i==n || j==i*2-1)
                System.out.print(ch);
                else
                System.out.print(" ");
            }
            System.out.println();
            ch++;
        }
    }
}