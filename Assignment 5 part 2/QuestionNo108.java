class Number {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>0;i--){
           for(int k=1;k<i;k++){
               System.out.print(" ");
           }
            for(int j=n;j>=i;j--){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}