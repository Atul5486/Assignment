class Alpha {
    public static void main(String[] args) {
        int n=5;
        char ch='E';
        for(int i=n;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print(ch);
            }
                ch--;
            System.out.println();
        }
    }
}