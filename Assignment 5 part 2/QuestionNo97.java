class Alphabet{
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>0;i--){
            char ch='A';
            for(int j=i;j>0;j--){
                    if(j==i || j==1 || i==n)
                    System.out.print(ch);
                    else
                    System.out.print(" ");
                    ch++;  
            }
            System.out.println();
        }
    }
}