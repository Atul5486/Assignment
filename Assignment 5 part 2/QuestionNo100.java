class Number{
    public static void main(String[] args) {
        int n=6;
        for(int i=n;i>0;i--){
            if(i%2==0){
                for(int j=1;j<=i;j++){
                
                    System.out.print(j);
            }
            }else{
                for(int k=i;k>0;k--){
                    System.out.print(k);
                }
            }
            
            System.out.println();
        }
    }
}