class Series{
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>0;i--){
            for(int j=i;j>0;j--){
                String str=(i%2==0) ? "#":"*";
                System.out.print(str);
            }
            System.out.println();
        }
    }
}