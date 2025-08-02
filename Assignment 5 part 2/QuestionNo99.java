class Number{
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>0;i--){
            for(int j=i;j>0;j--){
                    if(j==i || j==1 || i==n)
                    System.out.print(i);
                    else
                    System.out.print(" ");  
            }
            System.out.println();
        }
    }
}