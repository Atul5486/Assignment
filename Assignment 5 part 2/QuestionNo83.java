class AlphaTri{
    public static void main(String args[]){
        int n=5;
        char ch='A';
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(j==0|| i==n-1 || i==j){
                 ch=(char)('A'+j);
                    System.out.print(ch);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
