class Alternative{
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                String str=((i+j)%2==0)?"1":"0";
            System.out.print(str);
            }
            System.out.println();
        }
    }
}
