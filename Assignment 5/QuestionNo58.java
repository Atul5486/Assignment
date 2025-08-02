import java.util.Scanner;

class Decimal{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=inp.nextInt();
        int bin=0,place=1;
        while (num > 0) {
        int remainder = num % 2;
        bin = bin + remainder * place;
        num = num / 2;
        place = place * 10;
    }
    System.out.println("Binary number is : "+bin);
        
    }
}
