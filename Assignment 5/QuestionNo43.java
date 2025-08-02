import java.util.Scanner;
class Binary{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a binary number : ");
        int num=inp.nextInt();
        int bin=num;
        int decimal=0,power=0;
        while(num > 0){
            int rem=num%10;
            if(rem!=0 && rem!=1){
                System.out.println("Invalid Binary Number");
                return;
            }
            decimal+=rem*Math.pow(2,power);
            power++;
            num=num/10;
        }
        System.out.println("Binary number is : "+bin+ " and decimal number is "+decimal);
    }
}