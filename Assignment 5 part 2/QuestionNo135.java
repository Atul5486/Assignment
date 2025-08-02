class Alpha{
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>0;i--){
            
           for(int k=i;k<n;k++){
               System.out.print(" ");
           }
           char ch='A';
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
            ch++;
            }
            System.out.println();
    }
        }
}