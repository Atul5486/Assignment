class AlphaSeries{
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
            char current=(char)('a'+j);
            System.out.print(current);
            }
            System.out.println();
        }
    }
}
