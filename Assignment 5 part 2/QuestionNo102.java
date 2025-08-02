class Alpha{
    public static void main(String[] args) {
        int n=4,count=1;
        char ch='A';
        for(int i=1;i<=n;i++){
                for(int j=1;j<=count;j++){
                    System.out.print(ch);
                    ch++;
            }
            System.out.println();
            count+=2;
        }
    }
}