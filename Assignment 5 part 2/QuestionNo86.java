class NumReverse{
    public static void main(String args[]){
        int n=5;
        for(int i=n;i>0;i--){
            for(int j=n;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
