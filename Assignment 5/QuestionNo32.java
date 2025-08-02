import java.util.Scanner;
class Alphabet {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = inp.nextInt();
        char up='A';
        char lo='a';
        for(int i=0;i<=n;i++){
            if(i%2==0){
                System.out.print(up+" ");
                up++;
            }else{
                System.out.print(lo+" ");
                lo++;
            }
        }

    }
}
