class AlphaTri{
    public static void main(String args[]){
        int n=5;
        char ch='a';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j==1|| i==n || i==j){
                    System.out.print(ch);
                    ch++;
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
