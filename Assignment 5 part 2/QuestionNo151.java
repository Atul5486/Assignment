class Number{
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<n*2-1;i++){
            for(int k=n*2-3;k>=i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++){
                if(j%2==0)
        System.out.print("0");
                else
                System.out.print("1");
            }
            System.out.println();
            
    }
    
}}