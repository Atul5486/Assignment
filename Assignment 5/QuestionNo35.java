import java.util.Scanner;
class Number {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=inp.nextInt();
        int rem,count=0;
        while(num>0){
           rem=num%10;
           num=num/10;
           count++;
        }
        System.out.println("Number of digit is :"+count);
    }
}