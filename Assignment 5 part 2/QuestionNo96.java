class Star{
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>0;i--){
            for(int j=i;j>0;j--){
                    String str=(j==i || j==1 || i==n) ? "*":" ";
                    System.out.print(str);
            }
            System.out.println();
        }
    }
}