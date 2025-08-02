import java.util.Scanner;
class Perfect {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number to check it perfect or not:");
        int num=inp.nextInt();
        int sum=0;
      for(int i=1;i<=num/2;i++){
          if(num%i==0){
              sum+=i;
          }
      }
     String res= (num==sum) ? "Perfect number." : "Not a perfect number.";
     System.out.println(res);
    }
}